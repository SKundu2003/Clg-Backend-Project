package com.test.ThymeleafTest.Repo;

import com.test.ThymeleafTest.Modules.AllDetailsOfUser;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.MongoRepository;

@Configuration
public interface UserReposetory extends MongoRepository<AllDetailsOfUser, String> {
    public AllDetailsOfUser findByEmail(String email);
    public void deleteByEmail(String emailId);
}
