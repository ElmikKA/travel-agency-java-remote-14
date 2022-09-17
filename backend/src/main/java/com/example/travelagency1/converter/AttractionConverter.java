package com.example.travelagency1.converter;

import com.example.travelagency1.dto.AttractionDto;
import com.example.travelagency1.entity.Attraction;
import org.springframework.stereotype.Component;

@Component
public class AttractionConverter implements Converter<Attraction, AttractionDto> {
    @Override
    public AttractionDto fromEntityToDto(Attraction entity) {
        return new AttractionDto(entity.getId(),entity.getDescription(),
                entity.getAgeRestrictions(),
                entity.getPhotos());
    }

    @Override
    public Attraction fromDtoToEntity(AttractionDto dto) {
        return new Attraction(dto.id(),dto.description(),
                dto.ageRestrictions(),
                dto.photos());
    }
}
