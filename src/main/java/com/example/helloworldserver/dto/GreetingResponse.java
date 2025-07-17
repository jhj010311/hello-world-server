package com.example.helloworldserver.dto;

import com.example.helloworldserver.domain.Greeting;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GreetingResponse {
    private Long id;
    private String langCode;
    private String message;

    public static GreetingResponse fromEntity(Greeting greeting) {
        return GreetingResponse.builder()
                .id(greeting.getId())
                .langCode(greeting.getLangCode())
                .message(greeting.getMessage())
                .build();
    }
}
