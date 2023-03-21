package com.mainProject.BackendOfResumePortal.Repo;

import com.mainProject.BackendOfResumePortal.Modules.AllDetailsOfUser;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.MongoRepository;

@Configuration
public interface UserReposetory extends MongoRepository<AllDetailsOfUser, Integer> {
    public AllDetailsOfUser findByEmail(String universityRoll);
    public void deleteByEmail(String univercityRoll);
}
