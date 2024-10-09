package br.com.bruno.dio_spring_security_jwt.dto;

import lombok.Data;

@Data
public class Login {
    private String username;
    private String password;
}
