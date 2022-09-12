package com.project.demo;





import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import org.springframework.web.servlet.ModelAndView;



@Controller

public class cadastro_sapatos {
    
    @RequestMapping("/cadastrarsapatos")
    public ModelAndView cadastrosapato(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("cadastro_sapatos.html");
        return modelAndView;
    }
    
    
}



