package com.enrollment;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController

public class EnrollmentApplication extends SpringApplication
{
    public static void main(String[] args)
    {
        run(EnrollmentApplication.class, args);
    }

    @GetMapping("/ping")
    public String ping() {
        return "Hello, Enrollment System!";
    }
}