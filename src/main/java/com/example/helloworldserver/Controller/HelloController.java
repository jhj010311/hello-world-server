package com.example.helloworldserver.Controller;

import com.example.helloworldserver.domain.Greeting;
import com.example.helloworldserver.repository.HelloRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class HelloController {

    private final HelloRepository repository;

    @GetMapping
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello, World!");
    }

    @GetMapping("/greeting")
    public ResponseEntity<String> greeting(@RequestParam String lang) {
        Greeting greeting = repository.getByLangCode(lang);

        return ResponseEntity.ok(greeting.getMessage());
    }
}
