package com.test.ThymeleafTest.Controllers;

import com.test.ThymeleafTest.Modules.AllDetailsOfUser;
import com.test.ThymeleafTest.Repo.UserReposetory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class SendUserDetailsJsonController {
//    @Autowired
//    UserReposetory userReposetory;
//    @CrossOrigin
//    @GetMapping("/json/user/{email}")
//    @ResponseBody
//    public AllDetailsOfUser getDetailsInJson(@PathVariable String email){
//        System.err.println("email is "+email);
//        return userReposetory.findByEmail(email);
//    }
}
