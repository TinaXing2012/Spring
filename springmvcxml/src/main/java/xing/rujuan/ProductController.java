package xing.rujuan;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {

    @PostMapping("/save")
    public String saveProduct(){
        return "welcome";
    }
}
