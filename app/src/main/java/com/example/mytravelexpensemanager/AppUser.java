package com.example.mytravelexpensemanager;

import android.widget.EditText;

public class AppUser {
    String name, email, pass, mobile;

    public AppUser() {
    }

    public AppUser(String name, String email, String pass, String mobile) {
        this.name = name;
        this.email = email;
        this.pass = pass;
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPass() {
        return pass;
    }

    public String getMobile() {
        return mobile;
    }
}
