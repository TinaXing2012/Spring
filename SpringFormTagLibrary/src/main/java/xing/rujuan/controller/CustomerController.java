package xing.rujuan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import xing.rujuan.model.Customer;
import xing.rujuan.model.Phone;

@Controller
public class CustomerController {

    @GetMapping("/")
    public String getCustomerForm(@ModelAttribute("customer") Customer customer){
        return "customerForm";
    }

    @PostMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute("customer") Customer customer){
        //save to DB
        return "customerDetail";
    }

    @GetMapping("/edit")
    public String editCustomer(Model model){
        Phone p = new Phone("123", "456", "7890");
        Customer customer = new Customer("Tina", "Xing", p);
        model.addAttribute("customer", customer);
        return "customerEditForm";
    }

}
