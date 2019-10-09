package xing.rujuan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class ViewResolverDemoController {

    @GetMapping("/")
    public String home(){
        return "index";
    }

    @ModelAttribute("projectName")
    public String getProjectName(){
        return "View Resolver Demo";
    }

}
