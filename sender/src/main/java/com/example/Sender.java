package com.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Sender {

    public static void main(String[] args) {

        String URL = "http://localhost:8080/user";

        RestTemplate rt = new RestTemplate();

        for (int i = 0; i <= 100; i++) {
            String user = rt.getForObject(URL, String.class);
            System.out.println(user);
        }
    }
}
