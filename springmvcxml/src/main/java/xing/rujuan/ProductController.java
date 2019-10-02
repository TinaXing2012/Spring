package xing.rujuan;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/product")
public class ProductController {


    //http://localhost:8080/product/listProducts?categoryId=1&categoryName=computer
    @GetMapping("/listProducts")
    public String getProductByCategory(@RequestParam Integer categoryId,
                                       @RequestParam(value = "categoryName", required = false, defaultValue = "laptop") String name) {
        System.out.println("Id: " + categoryId + " , Name: " + name);
        return "welcome";
    }

    //http://localhost:8080/product/categoryId/2/categoryName/computer
    @GetMapping("categoryId/{cateid}/categoryName/{cateName}")
    public String getProducts(@PathVariable String cateid, @PathVariable("cateName") String name){
        System.out.println("cateId: " + cateid + " , cateName: " + name);
        return "welcome";
    }

    @PostMapping("/save")
    public String saveProduct() {
        return "welcome";
    }
}
