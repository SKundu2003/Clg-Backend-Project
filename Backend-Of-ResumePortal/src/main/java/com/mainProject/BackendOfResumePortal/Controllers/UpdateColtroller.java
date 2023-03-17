package com.mainProject.BackendOfResumePortal.Controllers;

import com.mainProject.BackendOfResumePortal.Modules.AllDetailsOfUser;
import com.mainProject.BackendOfResumePortal.Repo.UserReposetory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UpdateColtroller {
    @Autowired
    UserReposetory userReposetory;

    //only if authenticated then only user can update data
    @PostMapping("/update/{id}")
    public String showAllDataOfAUser(@PathVariable String id, @RequestBody AllDetailsOfUser allDetailsOfUser)
    {

        userReposetory.deleteByUniversityRoll(id);
        userReposetory.save(allDetailsOfUser);
        return "data updated";
    }
}
