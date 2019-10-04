package xing.rujuan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;

@Controller
@RequestMapping("/application")
public class ApplicationScopeAttributeController {

    @Autowired
    ServletContext servletContext;

    @GetMapping("/")
    public String setApplicationScopeAttribute(){
        servletContext.setAttribute("applicationName", "Model Scoped Attributes");
        return "redirect:/application/display";
    }

    @GetMapping("/display")
    public String display(){
        return "appScopeAttribute";
    }
}
