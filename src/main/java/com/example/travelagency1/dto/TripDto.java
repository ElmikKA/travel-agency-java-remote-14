package com.example.travelagency1.dto;

import com.example.travelagency1.entity.Destination;
import com.example.travelagency1.entity.HotelFacilities;
import com.example.travelagency1.entity.Price;
import com.example.travelagency1.entity.SecurityRules;
import com.example.travelagency1.entity.enumeration.MealType;
import com.example.travelagency1.entity.enumeration.PaymentType;
import com.example.travelagency1.entity.enumeration.TransportTypes;
import lombok.Builder;

import java.time.LocalDate;
import java.util.List;

@Builder
public record TripDto(
        LocalDate tripStartDate,
        LocalDate tripEndDate,
        Destination destination, // TODO: use dto
        Price tripPrice, // TODO: should we use dto??
        TransportTypes typeofTransport,
        SecurityRules securityRules, // TODO; use dto
        PaymentType paymentType,
        MealType mealType,
        HotelFacilities hotelFacilities, // TODO: use dto
        List<String> photos
) {
}
