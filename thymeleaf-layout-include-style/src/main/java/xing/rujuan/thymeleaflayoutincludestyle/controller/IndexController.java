package xing.rujuan.thymeleaflayoutincludestyle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){
        return "index";
    }


    @GetMapping("/user")
    public String user(){
        return "user";
    }

    @GetMapping("/admin/index")
    public String admin(){
        return "admin";
    }
}
