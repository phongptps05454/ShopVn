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
import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("register")
public class RegisterController {

    @Autowired
    private CustomerDAO daoregister;

    /**
     * GET: register.html
     */
    @RequestMapping()
    public String showRegister() {
        return "register";
    }

    /**
     * POST: register.htm
     */
    @RequestMapping(params = "btnRegister", method = RequestMethod.POST)
    public String register(ModelMap model, @ModelAttribute("userregister") Customer user, @RequestParam("username") String showusername, @RequestParam("password") String password1, @RequestParam("password2") String password2) {
        try {
            if (password1.equals(password2)) {
                Random id = new Random();
                int idUp = id.nextInt(1000000);
                user.setId(idUp);
                user.setPassword(PasswordMD5.toolMD5(password1));
                daoregister.insert(user);
                model.addAttribute("errors", "Đăng ký thành công!");
                return "register";

            } else {
                model.addAttribute("errors", "Nhập lại mật khẩu không khớp");
                return "register";
            }
        } catch (Exception ex) {
            model.addAttribute("errors", "Tài khoản đã tồn tại !");
            return "register";
        }
    }
}
