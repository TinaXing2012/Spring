package xing.rujuan.thymeleafexpressionsyntax.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import xing.rujuan.thymeleafexpressionsyntax.domain.Person;

import java.util.Arrays;
import java.util.List;

@Controller
public class IterationExpressionController {

    @GetMapping("/iterationExpression")
    public String iterationExpression(Model model){
        List<Person> people = Arrays.asList(
                new Person(91, "Josh"),
                new Person(92, "Mary"),
                new Person(93, "Elsa")
        );
        model.addAttribute("people", people);
        return "iterationExpression";
    }
}
