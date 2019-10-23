/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.controller;

import java.util.Date;

/**
 *
 * @author phong
 */
public class NewClass {

    // main method 
    public static void main(String[] args) {

        // creating a date object with specifed time. 
        Date dateOne = new Date();

        System.out.println("Date initially: "
                + dateOne);

        // Sets the time 
        dateOne.setTime(1000);

        // Prints the time 
        System.out.println("Date after setting"
                + " the time: "
                + dateOne);
    }
}
