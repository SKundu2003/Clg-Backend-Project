package com.test.ThymeleafTest.Modules;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.ArrayList;
import java.util.Collection;

@Document
public class AllDetailsOfUser implements UserDetails {
    private String about;
    private String name;
    private String email;

    private String number;
    private String address;
    private String education_school1; //collage name

    private String education_school2; //school name

    private String experience1_title;//title of 1st experience

    private String about_experience1;

    private String experience2_title;//title of 2nd experience

    private String about_experience2;
    private String skills;
    private String password;

    public AllDetailsOfUser(String about, String name, String email, String number, String address, String education_school1, String education_school2, String experience1_title, String about_experience1, String experience2_title, String about_experience2, String skills, String password) {
        this.about = about;
        this.name = name;
        this.email = email;
        this.number = number;
        this.address = address;
        this.education_school1 = education_school1;
        this.education_school2 = education_school2;
        this.experience1_title = experience1_title;
        this.about_experience1 = about_experience1;
        this.experience2_title = experience2_title;
        this.about_experience2 = about_experience2;
        this.skills = skills;
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


    public void setPassword(String password) {
        this.password = password;
    }


    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEducation_school1() {
        return education_school1;
    }

    public void setEducation_school1(String education_school1) {
        this.education_school1 = education_school1;
    }

    public String getEducation_school2() {
        return education_school2;
    }

    public void setEducation_school2(String education_school2) {
        this.education_school2 = education_school2;
    }

    public String getExperience1_title() {
        return experience1_title;
    }

    public void setExperience1_title(String experience1_title) {
        this.experience1_title = experience1_title;
    }

    public String getAbout_experience1() {
        return about_experience1;
    }

    public void setAbout_experience1(String about_experience1) {
        this.about_experience1 = about_experience1;
    }

    public String getExperience2_title() {
        return experience2_title;
    }

    public void setExperience2_title(String experience2_title) {
        this.experience2_title = experience2_title;
    }

    public String getAbout_experience2() {
        return about_experience2;
    }

    public void setAbout_experience2(String about_experience2) {
        this.about_experience2 = about_experience2;
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
