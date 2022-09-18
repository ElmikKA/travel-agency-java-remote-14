package com.example.travelagency1.controller.advisor;

import com.example.travelagency1.dto.ErrorResponse;
import com.example.travelagency1.exception.TripNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.time.LocalDateTime;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.NOT_FOUND;

@Slf4j
@RestControllerAdvice
public class TripControllerAdvisor {

    // TODO: fix status code
    @ResponseStatus(NOT_FOUND)
    @ExceptionHandler(TripNotFoundException.class)
    public ErrorResponse handleNotFoundTrip(TripNotFoundException exc){
        log.warn("handling not found trip", exc);//Google about (@Slf4j) log method!!!
        return new ErrorResponse(LocalDateTime.now(),
                NOT_FOUND.value(),
                exc.getMessage(),
                //shows as that path is our url
                ServletUriComponentsBuilder.fromCurrentRequest().build().toUriString());
    }

    @ResponseStatus(BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ErrorResponse handleBadRequest(MethodArgumentNotValidException exc){
        log.warn("unexpected validation exception occurred :)", exc);

        return new ErrorResponse(LocalDateTime.now(),
                BAD_REQUEST.value(),
                exc.getMessage(),
                ServletUriComponentsBuilder.fromCurrentRequest().build().toUriString());
    }
}
