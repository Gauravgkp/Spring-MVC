package com.stackroute.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.management.modelmbean.ModelMBean;

@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String greeting(ModelMap map){
        map.addAttribute("greetings", "welcome to stackroute");
        return "index";
    }
}
