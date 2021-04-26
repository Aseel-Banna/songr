package com.example.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppController {

    @GetMapping("/")
    public String makeSplashPage(){
        return "home.html";
    }

    @GetMapping("/hello")
    public String showHelloWorld(){
        return "template.html";
    }

    @GetMapping("/capitalize/{sentence}")
    public String showTemplate(Model m, @PathVariable("sentence") String sentence){
        m.addAttribute("sentence",sentence);
        return "capitalize.html";
    }

    @GetMapping("/capitalize")
    @ResponseBody
    public String showTemplateNull(){
            return "No entered sentence or word!";
    }
}
