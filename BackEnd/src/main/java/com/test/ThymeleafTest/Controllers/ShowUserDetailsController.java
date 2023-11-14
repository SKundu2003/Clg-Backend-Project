package com.test.ThymeleafTest.Controllers;

import com.test.ThymeleafTest.Modules.AllDetailsOfUser;
import com.test.ThymeleafTest.Repo.UserReposetory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ShowUserDetailsController {
    @Autowired
    UserReposetory userReposetory;

    @GetMapping("/user/{email}")
    @ResponseBody
    public ResponseEntity<AllDetailsOfUser> fetchUserData(@PathVariable("email") String email) {
        try {

            // Log the count of documents in the collection

            AllDetailsOfUser userDetails = userReposetory.findByEmail(email);

            if (userDetails != null) {
                // Log the result of findByEmail
                return ResponseEntity.ok(userDetails);
            } else {
                // Log a message if the user is not found
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            // Log any exceptions that occur
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }



    @CrossOrigin
    @GetMapping("/all")
    @ResponseBody
    public List<AllDetailsOfUser> showAllDataOfAUser() {
        return userReposetory.findAll();
    }


//    @CrossOrigin
//    @GetMapping("/user/mv2/{email}")
//    public String showAllDataOfAUser2(@PathVariable String email, Model model) {
//        AllDetailsOfUser user2 = userReposetory.findByEmail(email);
//        model.addAttribute("user2", user2);
//        return "mv2";
//    }
//
//    @CrossOrigin
//    @GetMapping("/user/mv3/{email}")
//    public String showAllDataOfAUser3(@PathVariable String email, Model model) {
//        AllDetailsOfUser user = userReposetory.findByEmail(email);
//        model.addAttribute("user", user);
//        // return "MainResumeView";
//        return "mv3";
//    }
}
