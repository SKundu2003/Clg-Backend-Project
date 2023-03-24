package com.test.ThymeleafTest.Controllers;


import com.test.ThymeleafTest.Modules.AllDetailsOfUser;
import com.test.ThymeleafTest.Repo.UserReposetory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<?> showAllDataOfAUser(@PathVariable String id, @RequestBody AllDetailsOfUser allDetailsOfUser)
    {

        userReposetory.deleteByEmail(id);
        userReposetory.save(allDetailsOfUser);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
