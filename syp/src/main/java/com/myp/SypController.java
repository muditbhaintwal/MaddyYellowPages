package com.myp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class SypController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }

    @GetMapping("/service/{service}")
    public String getProvider(@PathVariable("service") String service) {
        if (Objects.equals(service, "electrician")) {
            System.out.println("7007007007");
            return "Electrician_7007007007";
        }
        return null;
    }
}
