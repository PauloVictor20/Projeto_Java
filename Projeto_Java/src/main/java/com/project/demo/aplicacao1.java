package com.project.demo;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.servlet.ModelAndView;



@Controller
public class aplicacao1 {
    
    @RequestMapping("/")
    @ResponseBody
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index.html");
        return modelAndView;
    }
    
}
//@RequestMapping("/users")
//public String helloWorld(){
    //return "resources/templates/index";
//}