package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jt on 12/26/19.
 */
@RestController
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    
    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public List<String> getProducts() {
       List<String> productsList = new ArrayList<>();
       productsList.add("Honey");
       productsList.add("Almond");
       return productsList;
    }

    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public String createProduct() {
       return "Product is saved successfully";
    }
    
    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
