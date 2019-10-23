/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.controller;

import MD5Tool.PasswordMD5;
import Tool.RandoomPw;
import com.project.dao.CustomerDAO;
import com.project.entity.Customer;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.Random;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
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
@RequestMapping("resetpw")
public class ResetpwController {

    @Autowired
    private CustomerDAO dao;
    @Autowired
    JavaMailSender mailSender;

    @RequestMapping()
    public String showRegister() {
        return "resetpw";
    }

    @RequestMapping(params = "btnSendpw", method = RequestMethod.POST)
    public String Resetpw(@ModelAttribute("resetpw") Customer user, ModelMap model, @RequestParam("username") String username, @RequestParam("email") String email) {
        try {
            if (dao.getByUsername(username).getUsername().equals(username)) {
                if (dao.getByUsername(username).getEmail().equals(email)) {
                    Date date =new Date();
                    String randoompw = RandoomPw.Randoom();
                    System.out.println("Sending text...");
                    SimpleMailMessage message = new SimpleMailMessage();
                    message.setFrom("ps05401auto@gmail.com");
                    message.setTo(email);
                    message.setSubject("Đổi mật khẩu ShopVn");
                    message.setText("Thông báo. Mật khẩu của tài khoản: " + username + " vừa được thay đổi. Vào: " + date+ ". Mật khẩu mới của bạn là: " + randoompw);
                    // sending message
                    mailSender.send(message);
                    System.out.println("Sending text done!");
                    //Process Dao
                    user.setPassword(PasswordMD5.toolMD5(randoompw));
                    dao.resetPw(user);
                    model.addAttribute("errors", "Sucessful: Thay đổi mật khẩu Thành Công!");
                    return "loadpages";
                } else {
                    model.addAttribute("errors", "Sai email!");
                    return "resetpw";
                }
            } else {
                model.addAttribute("errors", "Tài khoản không tồn tại");
                return "resetpw";
            }
        } catch (Exception e) {
            model.addAttribute("errors", "Sai tài khoản");
            return "resetpw";
        }

//        try {
//            String showUsername = dao.getByUsername(user.getUsername()).getUsername();
//            String showEmail = dao.getByUsername(user.getUsername()).getEmail();
//            if ((dao.getByUsername(user.getUsername()).getUsername()).equals(username)) {
//                if (showEmail.equals(email)) {
//                    String randoompw = RandoomPw.Randoom();
//                    System.out.println("Sending text...");
//                    SimpleMailMessage message = new SimpleMailMessage();
//                    message.setFrom("ps05401auto@gmail.com");
//                    message.setTo(email);
//                    message.setSubject("Đổi mật khẩu ShopVn");
//                    message.setText("Thông báo. Mật khẩu của tài khoản: " + username + " vừa được thay đổi." + " Mật khẩu mới của bạn là: " + randoompw);
//                    // sending message
//                    mailSender.send(message);
//                    System.out.println("Sending text done!");
//                    //Process Dao
//                    user.setPassword(PasswordMD5.toolMD5(randoompw));
//                    dao.resetPw(user);
//                    model.addAttribute("errors", "Sucessful: Thay đổi mật khẩu Thành Công!" + user.getUsername());
//                    return "resetpw";
//                } else {
//                    model.addAttribute("errors", "Email không đúng");
//                    return "resetpw";
//                }
//            } else {
//                model.addAttribute("errors", "Tài khoản không đúng");
//                return "resetpw";
//            }
//        } catch (Exception e) {
//            model.addAttribute("errors", "False: Thay đổi mật khẩu Thất Bại!");
//            return "resetpw";
//        }
    }

}
