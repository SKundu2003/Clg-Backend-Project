package com.mainProject.BackendOfResumePortal.Modules;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.ArrayList;
import java.util.Collection;

@Document
public class AllDetailsOfUser implements UserDetails {
    private String name;
    private String email;
    private String PhoneNumber;
    private String password;
    private String universityRoll;
    private String About;
    private String skills;
    private String language;
    private String project;

    public AllDetailsOfUser(String name, String email, String phoneNumber, String password, String universityRoll, String about, String skills, String language, String project) {
        this.name = name;
        this.email = email;
        this.PhoneNumber = phoneNumber;
        this.password = password;
        this.universityRoll = universityRoll;
        About = about;
        this.skills = skills;
        this.language = language;
        this.project = project;
    }
    public AllDetailsOfUser(String name,String universityRoll,String password)
    {
        this.name = name;
        this.universityRoll = universityRoll;
        this.password = password;
    }

    public AllDetailsOfUser() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    public String getUniversityRoll() {
        return this.universityRoll;
    }

    public void setUniversityRoll(String universityRoll) {
        this.universityRoll = universityRoll;
    }

    public String getAbout() {
        return About;
    }

    public void setAbout(String about) {
        About = about;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

//Security Configuration
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        ArrayList<GrantedAuthority> list = new ArrayList<>();
        GrantedAuthority obj = new SimpleGrantedAuthority("user");
        list.add(obj);
        return list;
    }

    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.name;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }


}
