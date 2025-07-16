package com.example.helloworldserver.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "greetings")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Greeting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "lang_code", nullable = false, unique = true)
    private String langCode;

    @Column(nullable = false)
    private String message;

}