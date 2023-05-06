package com.example;

@org.springframework.stereotype.Service
public class Service {

    public User getUser() {
        return new User("1", "John");
    }
}
