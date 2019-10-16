package xing.rujuan.employeemanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import xing.rujuan.employeemanagement.domain.Employee;

@Controller
public class EmployeeController {

    @GetMapping({"/","/addEmp"})
    public String getEmpForm(@ModelAttribute("emp") Employee emp){
        return "empForm";
    }

    @PostMapping("/addEmp")
    public String saveEmp(@ModelAttribute("emp") Employee emp, RedirectAttributes ra){
        //save to DB
        ra.addFlashAttribute("savedEmployee", emp);
        return "redirect:/detail";
    }

    @GetMapping("/detail")
    public String detail(){
        return "empDetail";
    }

}
