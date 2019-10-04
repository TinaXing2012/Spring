package xing.rujuan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import xing.rujuan.Order;

@Controller
public class OrderController {

    @GetMapping("/")
    public String orderForm(@ModelAttribute Order myOrder){
        return "orderForm";
    }

    @PostMapping("/saveOrder")
    public String saveOrder(Order order){
        //save to DB
        System.out.println("Save to DB....");

        return "redirect:/success";
    }

    @GetMapping("/success")
    public String success(){
        return "thankyou";
    }
}
