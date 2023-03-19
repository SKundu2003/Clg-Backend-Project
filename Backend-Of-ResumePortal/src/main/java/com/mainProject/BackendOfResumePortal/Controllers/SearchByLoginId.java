package com.mainProject.BackendOfResumePortal.Controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class SearchByLoginId {
    @PostMapping("/search/{}")
    public String SearchUser(){
        return "toDo";
    }
}
