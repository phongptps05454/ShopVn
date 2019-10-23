/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.controller;

import com.project.dao.CustomerDAO;
import com.project.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author phong
 */
@Controller
@RequestMapping("profile")
public class ProfileController {

    @Autowired
    private CustomerDAO dao;

    @RequestMapping()
    public String showRegister() {
        return "profile";
    }

    /**
     *
     * 
     */
    @RequestMapping(params = "linkProfs", method = RequestMethod.GET)
    public String edit(@ModelAttribute("id") Integer id, ModelMap model) {
        try {
            Customer profileCus = dao.getID(id);
            model.addAttribute("profs", profileCus);
            return "profile";
        } catch (Exception e) {
            model.addAttribute("message", "Xảy ra lỗi khi edit");
            return "index";
        }
    }
}
