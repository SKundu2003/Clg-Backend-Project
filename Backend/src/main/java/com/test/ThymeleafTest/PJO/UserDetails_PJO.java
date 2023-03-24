package com.test.ThymeleafTest.PJO;

import org.springframework.security.core.userdetails.UserDetails;

public class UserDetails_PJO {
        public String about;
        public String name;
        public String email;

        public String number;
        public String address;
        public String education_school1; //collage name

        public String education_school2; //school name

        public String experience1_title;//title of 1st experience

        public String about_experience1;

        public String experience2_title;//title of 2nd experience

        public String about_experience2;
        public String skills;
        public String password;

        public UserDetails_PJO(String about, String name, String email, String number, String address, String education_school1, String education_school2, String experience1_title, String about_experience1, String experience2_title, String about_experience2, String skills, String password) {
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

        public UserDetails_PJO() {
        }

        public String getAbout() {
                return about;
        }

        public void setAbout(String about) {
                this.about = about;
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

        public String getPHoneNumber() {
                return number;
        }

        public void setNumber(String number) {
                this.number = number;
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

        public String getSkills() {
                return skills;
        }

        public void setSkills(String skills) {
                this.skills = skills;
        }

        public String getPassword() {
                return password;
        }

        public void setPassword(String password) {
                this.password = password;
        }
}
