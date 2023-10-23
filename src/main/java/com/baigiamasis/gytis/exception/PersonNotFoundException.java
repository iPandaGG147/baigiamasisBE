package com.baigiamasis.gytis.exception;

public class PersonNotFoundException extends RuntimeException{
    public PersonNotFoundException(int id){
        super("Id does not exist: " + id);
    }
}
