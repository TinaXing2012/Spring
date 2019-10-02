package xing.rujuan;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/product")
public class ProductController {


    //http://localhost:8080/product/listProducts?categoryId=1
    @GetMapping("/listProducts")
    public String getProductByCategory(@RequestParam Integer categoryId,
                                       @RequestParam(value = "categoryName", required = false, defaultValue = "laptop") String name) {
        System.out.println("Id: " + categoryId + " , Name: " + name);
        return "welcome";
    }

    @PostMapping("/save")
    public String saveProduct() {
        return "welcome";
    }
}
