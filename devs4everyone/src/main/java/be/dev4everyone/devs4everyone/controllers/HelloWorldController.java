package be.dev4everyone.devs4everyone.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public ResponseEntity<String> helloWorld() {
        return ResponseEntity.ok("Hello world");
    }
}