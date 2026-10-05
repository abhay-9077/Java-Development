package com.project.SpringBootMavenApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class SpringBootMavenWebAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMavenWebAppApplication.class, args);
    }

    @RequestMapping("/greet")
    public String greet() {
        return "greet";
    }
}