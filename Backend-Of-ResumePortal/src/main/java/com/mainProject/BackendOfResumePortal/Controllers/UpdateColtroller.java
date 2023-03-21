package com.mainProject.BackendOfResumePortal.Controllers;

import com.mainProject.BackendOfResumePortal.Modules.AllDetailsOfUser;
import com.mainProject.BackendOfResumePortal.Repo.UserReposetory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")


public class UpdateColtroller {
    @Autowired
    UserReposetory userReposetory;

    //only if authenticated then only user can update data
    @CrossOrigin
    @PostMapping("/update/{id}")
    public String showAllDataOfAUser(@PathVariable String id, @RequestBody AllDetailsOfUser allDetailsOfUser)
    {

        userReposetory.deleteByEmail(id);
        userReposetory.save(allDetailsOfUser);
        return "data updated";
    }
}
