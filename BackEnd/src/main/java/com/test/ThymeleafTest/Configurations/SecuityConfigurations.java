package com.test.ThymeleafTest.Configurations;

import com.test.ThymeleafTest.MyUserDetailService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@EnableWebSecurity
public class SecuityConfigurations extends WebSecurityConfigurerAdapter {
    @Autowired
    UserService userService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userService);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .cors().disable()
                .csrf().disable()//this is most import with out this PostMan cant send request
                .httpBasic()//this tag will remove the HTMl page //helps to see from postman
                .and()
                .authorizeRequests()
                .antMatchers("/createUser").permitAll()
                .antMatchers("/user/**").permitAll()
                .antMatchers("/json/user/**").permitAll()
                .antMatchers("/update/**").permitAll()
                .and()
                .formLogin()//to show the default login window
                .defaultSuccessUrl("http://localhost:8080/update_data.html",true)
                .permitAll()
                .and()
                .logout().permitAll();
    }

    @Bean
    public PasswordEncoder getPasswordEncoder()
    {
        return NoOpPasswordEncoder.getInstance();//to set no password encoding
    }
}
