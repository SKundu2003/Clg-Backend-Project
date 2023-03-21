package com.mainProject.BackendOfResumePortal.Controllers;


import com.mainProject.BackendOfResumePortal.Modules.AllDetailsOfUser;
import com.mainProject.BackendOfResumePortal.Repo.UserReposetory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CreateAndFindController {
    @Autowired
    UserReposetory userReposetory;
    @CrossOrigin
    @PostMapping("/createUser")//creating the new user with all details
    public String createNewUser(@RequestBody AllDetailsOfUser userDetails)//change kora "AllDetailsOfUser" hoba -->for me
    {
        if(userReposetory.findByEmail(userDetails.getUniversityRoll())!=null)
        {
            //if user exist then
            return"UserAlready exist";

            //show a login window
        }
        //if not exist the save the data
        //bare minimum data need to pass
        AllDetailsOfUser allDetailsOfUser = new AllDetailsOfUser(userDetails.getName(),userDetails.getUniversityRoll(),userDetails.getPassword());
        userReposetory.save(allDetailsOfUser);
        return "UserCreation Successful";
        //show a login window
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
