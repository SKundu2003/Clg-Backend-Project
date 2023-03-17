package com.mainProject.BackendOfResumePortal.PJO;

public class UserLoginDetails {
    private String name;
    private String email;
    private String PhoneNumber;
    private String password;
    private String  universityRoll;

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

    public String getPassword() {
        return password;
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
}
