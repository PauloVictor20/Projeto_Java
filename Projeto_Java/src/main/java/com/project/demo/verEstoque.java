package com.project.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class verEstoque {

@Controller
public class cadastro_sapatos {
    
    @RequestMapping("/verestoque")
    public ModelAndView cadastrosapato(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("verestoque.html");
        return modelAndView;
    }
    
    
}

    
}
