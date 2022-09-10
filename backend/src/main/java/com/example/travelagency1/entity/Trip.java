package com.example.travelagency1.entity;

import com.example.travelagency1.entity.enumeration.MealType;
import com.example.travelagency1.entity.enumeration.PaymentType;
import com.example.travelagency1.entity.enumeration.TransportTypes;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@Data
@Entity
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//There will be a uniq number given by the database
    Long id;

    LocalDate tripStartDate;

    LocalDate tripEndDate;
    //dirty fix - ignore that field at the moment
    @Transient//Means that ignore that field
    Destination destination;

    @Transient
    Price tripPrice;

    @Enumerated(EnumType.STRING)
    TransportTypes typeOfTransport;

    @Transient
    SecurityRules rulesOfSecurity;

    @Enumerated(EnumType.STRING)
    PaymentType typeOfPayment;

    @Enumerated(EnumType.STRING)
    MealType typeOfMeal;

    @Transient
    HotelFacilities hotelFacilities;

    @Transient
    List<String> photos;

}
