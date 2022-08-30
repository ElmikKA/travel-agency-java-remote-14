package com.example.travelagency1.entity;

import lombok.*;

import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@Data
public class Trip {

    LocalDate tripStartDate;

    LocalDate tripEndDate;

    Destination destination;

    Price tripPrice;

    TransportTypes typeOfTransport;

    SecurityRules rulesOfSecurity;

    PaymentType typeOfPayment;

    MealType typeOfMeal;

    HotelFacilities hotelFacilities;

    List<String> photos;

}
