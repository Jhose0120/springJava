package com.platzi.pizza.service.exception;

public class EmailApiExeption extends RuntimeException{
    public EmailApiExeption() {
        super("Error sending email...");
    }
}
