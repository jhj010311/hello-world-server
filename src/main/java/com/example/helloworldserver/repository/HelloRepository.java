package com.example.helloworldserver.repository;

import com.example.helloworldserver.domain.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HelloRepository extends JpaRepository<Greeting, Long> {
    String getMessageByLangCode(String langCode);
}
