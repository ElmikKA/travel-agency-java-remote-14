package com.example.travelagency1.dto;

import java.util.List;

public record HotelFacilitiesDto(
        List<AttractionDto> attractions,

        List<String> apartmentFacilities
) {
}
