
package com.project.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import org.springframework.web.servlet.ModelAndView;


@Controller
public class creditos {


    @RequestMapping("/creditos")
    public ModelAndView cadastrosapato(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("creditos.html");
        return modelAndView;
    }
    
}
