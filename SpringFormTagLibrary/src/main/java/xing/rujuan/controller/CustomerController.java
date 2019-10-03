package xing.rujuan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import xing.rujuan.model.Country;
import xing.rujuan.model.Customer;
import xing.rujuan.model.Phone;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class CustomerController {

    @GetMapping("/")
    public String getCustomerForm(@ModelAttribute("customer") Customer customer, Model model){
        //1. List
//        List<String> countryList = Arrays.asList("United States", "China", "Vietnam");
//        model.addAttribute("countryList", countryList);

//        2. Map
//        Map<String, String> countryMap = new HashMap<>();
//        countryMap.put("US", "United States");
//        countryMap.put("CN", "China");
//        countryMap.put("VT", "Vietnam");
//        model.addAttribute("countryMap", countryMap);

//        3. List<Country>
        List<Country> countryObjList = Arrays.asList(
                new Country("US", "United States"),
                new Country("CN", "China"),
                new Country("VT", "Vietnam")
        );
        model.addAttribute("countryObjList", countryObjList);

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
