import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import org.springframework.web.servlet.ModelAndView;



public class creditos {


    @RequestMapping("/creditosalunos")
    public ModelAndView cadastrosapato(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("creditos.html");
        return modelAndView;
    }
    
}
