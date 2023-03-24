package com.test.ThymeleafTest.Controllers;



import com.test.ThymeleafTest.Modules.AllDetailsOfUser;
import com.test.ThymeleafTest.PJO.UserDetails_PJO;
import com.test.ThymeleafTest.Repo.UserReposetory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CreateAndFindController {

    @Autowired
    UserReposetory userReposetory;

    @CrossOrigin
    @PostMapping("/createUser")
    public void createNewUser(@RequestBody AllDetailsOfUser userDetails) {
        if(userReposetory.findByEmail(userDetails.getEmail()) != null) {
            // If user exists, do nothing
            return;
        }
        // If user does not exist, save to database
        System.out.println(userDetails.getAbout_experience1());
        userReposetory.save(userDetails);
    }


    //Show user Details
    //show data is accessable for all
    @CrossOrigin
    @GetMapping("/user/{id}")
    public AllDetailsOfUser showAllDataOfAUser(@PathVariable String id)
    {
        return userReposetory.findByEmail(id);
    }
}
