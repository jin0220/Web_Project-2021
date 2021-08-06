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


        @GetMapping("regulation")
        public String regulation(){
                return "contents/regulation";
        }
        @GetMapping("board")
        public String board(){
                return "contents/board";
        }

        @GetMapping("intro")
        public String intro() {return "contents/about/intro"; }

        @GetMapping("history")
        public String history() {return "contents/about/history"; }

}
