package com.test.ThymeleafTest.MyUserDetailService;

import com.test.ThymeleafTest.Modules.AllDetailsOfUser;
import com.test.ThymeleafTest.Repo.UserReposetory;
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
        if(userReposetory.findByEmail(Email)==null)
        {
            System.out.println("user not available");
            return new AllDetailsOfUser();
        }
        return userReposetory.findByEmail(Email);
    }
}
