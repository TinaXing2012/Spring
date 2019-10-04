package xing.rujuan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/session")
@SessionAttributes({"channelName", "hello"})
public class SessionScopeAttributeController {

    @GetMapping("/")
    public String setSessionAttribute(Model model, HttpSession session){
        model.addAttribute("channelName", "Miss Xing");
        model.addAttribute("hello", "world");
        session.setAttribute("authorName", "Tina Xing");
        session.setAttribute("channelName", "Thank you....");

        //When you use HttpSession to add Session Attribute, it will add immedidately
        //when you use @SessionAttribute to add attribute, it will add just before the page rendering,
        // before the current request ends
        return "redirect:/session/display";
    }

    @GetMapping("/display")
    public String display(SessionStatus status){
        //Only remove attributes set by using @SessionAttribute
        //It removes attributes from session scope after the page rendering
        status.setComplete();
        return "sessionScopeAttribute";
    }


}
