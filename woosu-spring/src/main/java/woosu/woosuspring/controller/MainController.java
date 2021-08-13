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
                return "contents/center/board";
        }

        @GetMapping("intro")
        public String intro() {return "contents/about/intro"; }

        @GetMapping("history")
        public String history() {return "contents/about/history"; }

        @GetMapping("vision")
        public String vision() {return "contents/about/vision"; }

        @GetMapping("system")
        public String system() {return "contents/about/system"; }


        @GetMapping("sitemap")
        public String sitemap(){
                return "contents/center/sitemap";
        }

        @GetMapping("pr")
        public String pr(){
                return "contents/center/pr";
        }

        @GetMapping("contact")
        public String contact(){
                return "contents/center/contact";
        }

        @GetMapping("recruit_info")
        public String recruit_info(){
                return "contents/recruit/recruit_info";
        }

}
