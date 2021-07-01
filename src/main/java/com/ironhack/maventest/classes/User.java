package com.ironhack.maventest.classes;

import com.ironhack.maventest.enums.UserStatus;

import java.util.Objects;

public class User {

    private String name;
    private String email;
    private int age;
    private UserStatus status;


    public User(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.status = UserStatus.ONLINE;
    }

    public User(String name, String email, int age, UserStatus status) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.status = status;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return getAge() == user.getAge() && getName().equals(user.getName()) && getEmail().equals(user.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getEmail(), getAge());
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", status=" + status +
                '}';
    }
}
