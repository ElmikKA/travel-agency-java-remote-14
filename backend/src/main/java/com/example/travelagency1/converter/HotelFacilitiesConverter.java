package com.example.travelagency1.converter;

import com.example.travelagency1.dto.AttractionDto;
import com.example.travelagency1.dto.HotelFacilitiesDto;
import com.example.travelagency1.entity.Attraction;
import com.example.travelagency1.entity.HotelFacilities;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class HotelFacilitiesConverter implements Converter<HotelFacilities, HotelFacilitiesDto> {
    private final AttractionConverter attractionConverter;

    public HotelFacilitiesConverter(AttractionConverter attractionConverter) {
        this.attractionConverter = attractionConverter;
    }

    @Override
    public HotelFacilitiesDto fromEntityToDto(HotelFacilities entity) {
        //TODO
        //Better than just return null;
        //throw new NotYetImplementedException();
        List<AttractionDto> attractionDtos = new ArrayList<>();
        for (Attraction attraction : entity.getAttractions()){
            AttractionDto attractionDto = attractionConverter.fromEntityToDto(attraction);
            attractionDtos.add(attractionDto);
        }
        return new HotelFacilitiesDto(attractionDtos, entity.getApartmentFacilities());
    }

    @Override
    public HotelFacilities fromDoToEntity(HotelFacilitiesDto dto) {
        //TODO
        return null;
    }
}
