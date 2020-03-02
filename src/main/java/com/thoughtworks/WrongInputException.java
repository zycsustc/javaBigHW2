package com.thoughtworks;

public class WrongInputException extends RuntimeException{
    private String message;
    public WrongInputException(String message){
        super();
        this.message = message;
        System.out.println(message);
    }
}
