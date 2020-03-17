package com.example.json;

import com.google.gson.annotations.SerializedName;

public class Student {
    protected String firstName;
    protected int age;
    protected String mail;

    public Student(String firstname, int age, String mail) {
        this.firstName = firstname;
        this.age = age;
        this.mail = mail;

    }
}
