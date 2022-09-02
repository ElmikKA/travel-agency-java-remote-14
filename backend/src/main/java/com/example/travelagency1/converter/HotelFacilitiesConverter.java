package com.example.travelagency1.converter;

import com.example.travelagency1.dto.HotelFacilitiesDto;
import com.example.travelagency1.entity.HotelFacilities;
import org.springframework.stereotype.Component;

@Component
public class HotelFacilitiesConverter implements Converter<HotelFacilities, HotelFacilitiesDto> {
    @Override
    public HotelFacilitiesDto fromEntityToDto(HotelFacilities entity) {
        //TODO
        return null;
    }

    @Override
    public HotelFacilities fromDoToEntity(HotelFacilitiesDto dto) {
        //TODO
        return null;
    }
}
