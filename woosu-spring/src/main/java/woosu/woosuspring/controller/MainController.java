package woosu.woosuspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.logging.Logger;

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
        public String board(@RequestParam(required=false) String page, Model model){
                model.addAttribute("page", page);
                return "contents/center/board";
        }

        @GetMapping("board_d")
        public String board_d(@RequestParam(required=false) String page, Model model){
                model.addAttribute("page", page);
                return "contents/center/board_d";
        }

        @GetMapping("intro")
        public String intro() {return "contents/about/intro"; }

        @GetMapping("history")
        public String history() {return "contents/about/history"; }

        @GetMapping("vision")
        public String vision() {return "contents/about/vision"; }

        @GetMapping("system")
        public String system() {return "contents/about/system"; }

        @GetMapping("ci")
        public String ci() {return "contents/about/ci"; }

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

        @GetMapping("rndintro")
        public String rndintro(){
                return "contents/rnd/rndintro";
        }

        @GetMapping("rndresult")
        public String rndresult(){
                return "contents/rnd/rndresult";
        }

        @GetMapping("rndcerti")
        public String rndcerti(){
                return "contents/rnd/rndcerti";
        }

        @GetMapping("subsidiary")
        public String subsidiary(){
                return "contents/about/subsidiary";
        }

        @GetMapping("locate")
        public String locate(){
                return "contents/about/locate";
        }







}
