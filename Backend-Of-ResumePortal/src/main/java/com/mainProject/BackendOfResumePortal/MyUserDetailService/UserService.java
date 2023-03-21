package com.mainProject.BackendOfResumePortal.MyUserDetailService;

import com.mainProject.BackendOfResumePortal.Modules.AllDetailsOfUser;
import com.mainProject.BackendOfResumePortal.Repo.UserReposetory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    UserReposetory userReposetory;
    @Override
    public AllDetailsOfUser loadUserByUsername(String Email) throws UsernameNotFoundException {
        return userReposetory.findByEmail(Email);
    }
}
