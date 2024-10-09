package br.com.bruno.dio_spring_security_jwt.dto;

import lombok.Data;

@Data
public class Sessao {
    private String login;
    private String token;
}
