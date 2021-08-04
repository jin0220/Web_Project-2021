package woosu.woosuspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {


        @GetMapping("/")
        public String home(){
            return "contents/home";
        }

        @GetMapping("greetings")
        public String greetings() {return "contents/greetings"; }
}
