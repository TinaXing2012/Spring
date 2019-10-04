package xing.rujuan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import xing.rujuan.model.Customer;

import javax.servlet.http.HttpServletRequest;

@Controller
public class RequestScopeAttributeController {

    @GetMapping("/")
    public String requestAttribute(Model model, HttpServletRequest request){
        model.addAttribute("channelName", "Miss Xing");
        model.addAttribute("year", 2019);
        Customer cust = new Customer(1, "Tina");
        model.addAttribute("customer", cust);
        model.addAttribute("abc"); //string=abc
        model.addAttribute(12.0); //double=12.0
        request.setAttribute("authorName", "Rujuan Xing");
        return "redirect:/display";
    }

    @GetMapping("/display")
    public String displayRequestAttribute(){
        return "requestScopeAttribute";
    }

}
