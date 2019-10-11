package xing.rujuan.thymeleafexpressionsyntax.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import xing.rujuan.thymeleafexpressionsyntax.domain.Address;
import xing.rujuan.thymeleafexpressionsyntax.domain.Person;

@Controller
public class ConditionalExpression {

    @GetMapping("/conditionalExpression")
    public String simpleExpression(Model model){
        Address address = new Address("1000 N 10th ST", "52556");
        Person tina1 = new Person(1, "Miss Xing", address);
        Person tina2 = new Person(2, "Rujuan Xing", null);
        model.addAttribute("person1", tina1);
        model.addAttribute("person2", tina2);

        model.addAttribute("gender", "M");
        return "conditionalExpression";
    }
}
