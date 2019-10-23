/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author phong
 */
@Controller
@RequestMapping("loadpages")
public class LoadpageController {
    
    @RequestMapping()
    public String Loadpage(){
        return "loadpages";
    }
}
