package com.example.controllerTest2.controller;

import com.example.controllerTest2.sevice.ServiceClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OurController {


    @Autowired
    private ServiceClass service;

    @RequestMapping("/")
    public String listItem()
    {
        return "home";
    }
}
