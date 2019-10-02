package xing.rujuan;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import xing.rujuan.model.User;


@Controller
@RequestMapping(value={"/user"})
public class SignUpController {

//    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    @GetMapping({"/", "/signup"})
    public String getSignUpForm() {
        return "SignUpForm";
    }

//    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    @PostMapping("/signup")
    public String saveUser(User user, Model model) {
        System.out.println(user);
        return "result";
    }

}
