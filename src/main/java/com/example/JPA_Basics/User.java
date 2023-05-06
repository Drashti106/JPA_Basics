package com.example.JPA_Basics;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name="User_Information")
public class User {
    @Id
    private int id;
    @Column(name = "User Name")
    private String name;
    private int age;
    private String mobile;

    public User(int id, String name, int age, String mobile) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mobile = mobile;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
