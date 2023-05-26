package com.example;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@RequiredArgsConstructor
@EnableWebMvc
@org.springframework.web.bind.annotation.RestController
public class RestController {

    private final Service service;

    @GetMapping(path = "user")
    public ResponseEntity<User> getUser() {
        return ResponseEntity.ok(service.getUser());
    }
}
