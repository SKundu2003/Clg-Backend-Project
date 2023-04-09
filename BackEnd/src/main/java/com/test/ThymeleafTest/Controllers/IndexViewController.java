package com.test.ThymeleafTest.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexViewController {
    @GetMapping("/")
    public String getIndexPage(){
        return "index";
    }
}
