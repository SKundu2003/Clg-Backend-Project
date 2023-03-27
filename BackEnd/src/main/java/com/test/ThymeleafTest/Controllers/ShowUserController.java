package com.test.ThymeleafTest.Controllers;

import com.test.ThymeleafTest.Modules.AllDetailsOfUser;
import com.test.ThymeleafTest.Repo.UserReposetory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class ShowUserController {
    @Autowired
    UserReposetory userReposetory;
    @CrossOrigin
    @GetMapping("/user/{email}")
    public String showAllDataOfAUser(@PathVariable String email, Model model)
    {
        AllDetailsOfUser user = userReposetory.findByEmail(email);
        model.addAttribute("user",user);
        return "MainResumeView";
    }
}
