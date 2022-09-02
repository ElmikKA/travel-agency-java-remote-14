package com.example.travelagency1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class HotelFacilities {
    List<Attraction> attraction;

    List<String> apartmentFacilities;
}
