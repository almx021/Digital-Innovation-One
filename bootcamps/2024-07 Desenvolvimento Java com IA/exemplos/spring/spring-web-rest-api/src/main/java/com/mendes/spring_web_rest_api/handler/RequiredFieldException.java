package com.mendes.spring_web_rest_api.handler;

public class RequiredFieldException extends BusinessException {
    public RequiredFieldException(String field) {
        super("O campo %s é obrigatório", field);
    }
}
