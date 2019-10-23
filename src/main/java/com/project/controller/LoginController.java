/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.controller;

import MD5Tool.PasswordMD5;
import com.project.dao.CustomerDAO;
import com.project.entity.Customer;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 *
 * @author phong
 */
@Controller
@RequestMapping("login")
@SessionAttributes(value = {"fullname", "id", "username"})
public class LoginController {

    @Autowired
    private CustomerDAO daologin;

    @RequestMapping()
    public String showlogin(){
        return "login";
    }
    
    @RequestMapping(params = "btnLogin", method = RequestMethod.POST)
    public String login(ModelMap model, @ModelAttribute("userlogin") Customer user, HttpSession session) {
        try {
            Customer cust = daologin.getByUsername(user.getUsername());
            user.setPassword(PasswordMD5.toolMD5(user.getPassword()));
            if (cust.getPassword().equals(user.getPassword())) {
                if (daologin.getByUsername(user.getUsername()).getBlocked() == 0) {
                    model.addAttribute("errors", "Đăng nhập thành công !");
                    model.addAttribute("fullname", daologin.getByUsername(user.getUsername()).getFullname());
                    model.addAttribute("id", daologin.getByUsername(user.getUsername()).getId());
                    session.getAttribute("fullname");
                    model.addAttribute("user", daologin.getAll());
                    return "redirect:/home.htm";
                } else {
                    model.addAttribute("errors", "Tài khoản đã bị khóa !");
                    return "login";
                }
            } else {
                model.addAttribute("errors", "Sai mật khẩu !");
            }
        } catch (Exception ex) {
            model.addAttribute("errors", "Sai mã đăng nhập !");
        }
        return "login";
    }
}
