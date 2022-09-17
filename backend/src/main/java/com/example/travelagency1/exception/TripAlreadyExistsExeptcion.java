package com.example.travelagency1.exception;

public class TripAlreadyExistsExeptcion extends RuntimeException{
    public TripAlreadyExistsExeptcion() {
    }

    public TripAlreadyExistsExeptcion(String message) {
        super(message);
    }

    public TripAlreadyExistsExeptcion(String message, Throwable cause) {
        super(message, cause);
    }

    public TripAlreadyExistsExeptcion(Throwable cause) {
        super(cause);
    }

    public TripAlreadyExistsExeptcion(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
