package com.test.ThymeleafTest.Controllers;

import com.test.ThymeleafTest.Modules.AllDetailsOfUser;
import com.test.ThymeleafTest.Repo.UserReposetory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ShowUserController {
    @Autowired
    UserReposetory userReposetory;

    @CrossOrigin
    @GetMapping("/user/{email}")
    public String showAllDataOfAUser1(@PathVariable String email, Model model) {
        AllDetailsOfUser user = userReposetory.findByEmail(email);
        model.addAttribute("user", user);
        return "MainResumeView";
    }

    @CrossOrigin
    @GetMapping("/user/mv2/{email}")
    public String showAllDataOfAUser2(@PathVariable String email, Model model) {
        AllDetailsOfUser user2 = userReposetory.findByEmail(email);
        model.addAttribute("user2", user2);
        return "mv2";
    }

    @CrossOrigin
    @GetMapping("/user/mv3/{email}")
    public String showAllDataOfAUser3(@PathVariable String email, Model model) {
        AllDetailsOfUser user = userReposetory.findByEmail(email);
        model.addAttribute("user", user);
        // return "MainResumeView";
        return "mv3";
    }
}
