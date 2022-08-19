package com.example.travelagency1.entity;

import lombok.*;
import net.bytebuddy.asm.Advice;

import java.time.LocalDate;

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

}
