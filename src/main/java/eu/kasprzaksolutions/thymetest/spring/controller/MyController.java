package eu.kasprzaksolutions.thymetest.spring.controller;
import eu.kasprzaksolutions.thymetest.domain.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MyController {
private List<Product> generateSampleProducts(){
    List<Product> returnList = new ArrayList<>(2);
    returnList.add(new Product("pierwszy",10));
    returnList.add(new Product("drugi",20));
    return returnList;

}
    @GetMapping("/")
    public String index(Model model) {

        model.addAttribute("message", "Hello Spring MVC 5!");
        model.addAttribute("productList",generateSampleProducts());
        return "index";
    }
}