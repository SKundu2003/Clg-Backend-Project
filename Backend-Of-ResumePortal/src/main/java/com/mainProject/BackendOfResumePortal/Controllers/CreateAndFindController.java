package com.mainProject.BackendOfResumePortal.Controllers;


import com.mainProject.BackendOfResumePortal.Modules.AllDetailsOfUser;
import com.mainProject.BackendOfResumePortal.PJO.UserLoginDetails;
import com.mainProject.BackendOfResumePortal.Repo.UserReposetory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CreateAndFindController {
    @Autowired
    UserReposetory userReposetory;
    @PostMapping("/createUser")//creating the new user with all details
    public String createNewUser(@RequestBody UserLoginDetails userDetails)//change kora "AllDetailsOfUser" hoba -->for me
    {
        if(userReposetory.findByUniversityRoll(userDetails.getUniversityRoll())!=null)
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
    @GetMapping("/user/{id}")
    public AllDetailsOfUser showAllDataOfAUser(@PathVariable String id)
    {
        return userReposetory.findByUniversityRoll(id);
    }

}
