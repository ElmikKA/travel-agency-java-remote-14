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
@Table(name = "TRIPS")
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//There will be uniq number given by the database
    Long id;

    LocalDate tripStartDate;

    LocalDate tripEndDate;

    //dirty fix - ignore that field at the moment
    //@Transient//Means that ignore that field

    @OneToOne
    Destination destination;

    @Embedded
    Price tripPrice;

    @Enumerated(EnumType.STRING)
    TransportTypes typeOfTransport;

    @OneToOne
    SecurityRules rulesOfSecurity;

    @Enumerated(EnumType.STRING)
    PaymentType typeOfPayment;

    @Enumerated(EnumType.STRING)
    MealType typeOfMeal;

    @OneToOne
    HotelFacilities hotelFacilities;

    @ElementCollection//Element collection will make a new collection that we cant modify
    @CollectionTable(name = "PHOTOS")
    @Column(name = "photo")
    List<String> photos;

}
