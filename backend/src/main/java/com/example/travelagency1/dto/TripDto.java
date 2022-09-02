package com.example.travelagency1.dto;

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

        DestinationDto destination,

        //inside dto field can have even different type
        // because dto is only for data transfer (as json mostly)
        String  cost,

        String currency,

        TransportTypes typeofTransport,

        SecurityRulesDto securityRules,

        PaymentType paymentType,

        MealType mealType,

        HotelFacilitiesDto hotelFacilities,

        List<String> photos
) {
}
