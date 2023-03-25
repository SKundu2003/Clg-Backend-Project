package com.test.ThymeleafTest.Controllers;



import com.test.ThymeleafTest.Modules.AllDetailsOfUser;
import com.test.ThymeleafTest.Repo.UserReposetory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CreateAndFindController {

    @Autowired
    UserReposetory userReposetory;

    @CrossOrigin
    @PostMapping("/createUser")
    public ResponseEntity<?> createNewUser(@RequestBody AllDetailsOfUser userDetails) {
        if (userReposetory.findByEmail(userDetails.getEmail()) != null) {
            // If user exists, return an error response
            return ResponseEntity.status(HttpStatus.CONFLICT).body("User already exists");
        }
        // If user does not exist, save to database and return a success response
        userReposetory.save(userDetails);
        System.out.println(userDetails.getNumber());
        return ResponseEntity.ok().build();
    }



    //Show user Details
    //show data is accessable for all
    @CrossOrigin
    @GetMapping("/user/{email}")
    public AllDetailsOfUser showAllDataOfAUser(@PathVariable String email)
    {
        return userReposetory.findByEmail(email);
    }
}
