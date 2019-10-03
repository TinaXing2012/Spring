package xing.rujuan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import xing.rujuan.model.Category;
import xing.rujuan.model.Product;

import java.util.Arrays;
import java.util.List;

@Controller
public class ProductController {

    @GetMapping("/getProductForm")
    public String getProductForm(@ModelAttribute("prod") Product product, Model model){
//        model.addAttribute("categoryList", Arrays.asList(
//                new Category(1, "Computer"),
//                new Category(2, "Laptop")
//        ));
//        model.addAttribute("prod", new Product());
        System.out.println("Inside getProductForm()....");
        System.out.println(model.asMap().get("categoryList"));
        return "productForm";
    }

    @GetMapping("/a")
    public String getA(Model model){
//        model.addAttribute("categoryList", Arrays.asList(
//                new Category(1, "Computer"),
//                new Category(2, "Laptop")
//        ));
        System.out.println("Inside getA()....");
        System.out.println(model.asMap().get("categoryList"));
        return "productForm";
    }

    @GetMapping("/b")
    public String getB(Model model){
//        model.addAttribute("categoryList", Arrays.asList(
//                new Category(1, "Computer"),
//                new Category(2, "Laptop")
//        ));
        System.out.println("Inside getB()....");
        System.out.println(model.asMap().get("categoryList"));
        return "productForm";
    }

    @ModelAttribute("categoryList")
    public List<Category> getCategoryList(){
        return  Arrays.asList(
                new Category(1, "Computer"),
                new Category(2, "Laptop")
        );
    }


}
