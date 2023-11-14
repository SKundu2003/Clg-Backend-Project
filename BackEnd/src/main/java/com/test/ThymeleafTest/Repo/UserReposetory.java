package com.test.ThymeleafTest.Repo;

import com.test.ThymeleafTest.Modules.AllDetailsOfUser;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserReposetory extends MongoRepository<AllDetailsOfUser, String> {
    AllDetailsOfUser findByEmail(String email);

    List<AllDetailsOfUser> findAll();

    public void deleteByEmail(String emailId);
}
