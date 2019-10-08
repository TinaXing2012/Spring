package xing.rujuan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import xing.rujuan.exception.UserNotFoundException;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(){
        return "redirect:/user/add";
    }

    @GetMapping("/user/retrieve")
    public String fakeGetUser(){
        throw new UserNotFoundException("This is a practice......");
    }
}
