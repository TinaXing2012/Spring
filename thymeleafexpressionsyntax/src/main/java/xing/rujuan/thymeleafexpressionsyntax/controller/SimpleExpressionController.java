package xing.rujuan.thymeleafexpressionsyntax.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import xing.rujuan.thymeleafexpressionsyntax.domain.Address;
import xing.rujuan.thymeleafexpressionsyntax.domain.Person;

@Controller
public class SimpleExpressionController {

    @GetMapping("/simpleExpression")
    public String simpleExpression(Model model){
        Address address = new Address("1000 N 10th ST", "52556");
        Person tina = new Person(1, "Miss Xing", address);
        model.addAttribute("person", tina);
        return "simpleExpression";
    }
}
