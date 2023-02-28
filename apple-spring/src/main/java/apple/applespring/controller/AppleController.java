package apple.applespring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppleController {
    
    @GetMapping("hyewoning")
    public String test() {
        return "hyewon";
    }
}
