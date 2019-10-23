/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.controller;

import MD5Tool.PasswordMD5;
import com.project.dao.CustomerDAO;
import com.project.entity.Customer;
import java.security.NoSuchAlgorithmException;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author phong
 */
@Controller
@RequestMapping("changepass")
public class ChangepwController {

    @Autowired
    private CustomerDAO dao;

    @Autowired
    JavaMailSender mailSender;

    @RequestMapping(params = "btnChangepw", method = RequestMethod.POST)
    public String changepw(@ModelAttribute("changepw") Customer user, ModelMap model, @RequestParam("password") String newpassword, @RequestParam("oldpassword") String passwordold) {
        try {
            if ((dao.getID(user.getId()).getPassword()).equals(PasswordMD5.toolMD5(passwordold))) {
                Customer id = dao.getID(user.getId());
                user.setPassword(PasswordMD5.toolMD5(newpassword));
                dao.changePw(user);
                Customer profileCus = dao.getID(user.getId());
                model.addAttribute("pws", profileCus);
                model.addAttribute("errors", "Mật khẩu đã được đổi");
                return "redirect:/login.htm";
            } else {
                Customer profileCus = dao.getID(user.getId());
                model.addAttribute("pws", profileCus);
                model.addAttribute("errors", "Mật khẩu cũ không đúng");
                return "changepass";
            }

        } catch (Exception e) {
            model.addAttribute("errors", "Lỗi: " + e);
            return "changepass";
        }

    }

    /**
     *
     *
     */
    @RequestMapping(params = "linkPw", method = RequestMethod.GET)
    public String edit(@ModelAttribute("id") Integer id, ModelMap model) {
        try {
            Customer profileCus = dao.getID(id);
            model.addAttribute("pws", profileCus);
            return "changepass";
        } catch (Exception e) {
            model.addAttribute("message", "Xảy ra lỗi khi edit");
            return "index";
        }
    }
}
