package com.example.travelagency1.dto;

import com.example.travelagency1.entity.enumeration.MealType;
import com.example.travelagency1.entity.enumeration.PaymentType;
import com.example.travelagency1.entity.enumeration.TransportTypes;
import lombok.Builder;

import javax.validation.Valid;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@Builder
public record TripDto(
        @Future
        LocalDate tripStartDate,

        @Future
        LocalDate tripEndDate,

        @Valid
        @NotNull
        DestinationDto destination,

        //inside dto field can have even different type
        // because dto is only for data transfer (as json mostly)
        @NotNull
        String  cost,

        @NotNull
        String currency,

        @NotNull
        TransportTypes typeofTransport,


        SecurityRulesDto securityRules,

        @NotNull
        PaymentType paymentType,

        MealType mealType,

        HotelFacilitiesDto hotelFacilities,

        List<String> photos
) {
}
