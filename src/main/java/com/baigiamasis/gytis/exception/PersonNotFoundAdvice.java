package com.baigiamasis.gytis.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class PersonNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(PersonNotFoundException.class)
    @ResponseStatus(HttpStatus.BAD_GATEWAY)
    public Map<String,String> exceptionHandler(PersonNotFoundException exception){
        Map<String, String> errorMap=new HashMap<>();
        errorMap.put("error", exception.getMessage());

        return errorMap;
    }

}