package com.example.travelagency1.converter;

import com.example.travelagency1.dto.DestinationDto;
import com.example.travelagency1.entity.Destination;
import org.springframework.stereotype.Component;

@Component
public class DestinationConverter implements Converter<Destination, DestinationDto> {
    @Override
    public DestinationDto fromEntityToDto(Destination entity) {
        //TODO
        return null;
    }

    @Override
    public Destination fromDoToEntity(DestinationDto dto) {
        //TODO
        return null;
    }
}
