package com.example.travelagency1.converter;

import com.example.travelagency1.dto.ErrorResponse;
import com.example.travelagency1.entity.Trip;
import org.springframework.stereotype.Component;

@Component
public class TripConverter implements Converter<Trip, TripDto> {

    @Override
    public TripDto fromEntityToDo(Trip entity) {
        return null;
    }

    @Override
    public Trip fromDoToEntity(TripDto dto) {
        return null;
    }
}
