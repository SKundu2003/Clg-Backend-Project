package com.test.ThymeleafTest.Controllers;

import com.test.ThymeleafTest.Modules.AllDetailsOfUser;
import com.test.ThymeleafTest.Repo.UserReposetory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class SendUserDetailsJsonController {
    @Autowired
    UserReposetory userReposetory;
    @GetMapping("/json/user/{email}")
    public AllDetailsOfUser getDetailsInJson(@PathVariable String email){
        return userReposetory.findByEmail(email);
    }
}
