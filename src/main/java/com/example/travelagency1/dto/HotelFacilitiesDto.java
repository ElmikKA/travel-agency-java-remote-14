package com.example.travelagency1.dto;

import com.example.travelagency1.entity.Attraction;

import java.util.List;

public record HotelFacilitiesDto(
        List<AttractionDto> attraction,

        List<String> apartmentFacilities
) {
}
