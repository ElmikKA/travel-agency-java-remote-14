package com.example.travelagency1.repository;

import com.example.travelagency1.entity.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface TripRepository extends JpaRepository<Trip, Long> {
    /**
     *     LocalDate tripStartDate;
     *
     *     LocalDate tripEndDate;
     *
     *     @OneToOne
     *     Destination destination;
     *
     *     @Embedded
     *     Price tripPrice;
     *
     *     @Enumerated(EnumType.STRING)
     *     TransportType typeOfTransport;s
     *
     *     @OneToOne
     *     SecurityRules securityRules;
     *
     *     @Enumerated(EnumType.STRING)
     *     PaymentType paymentType;
     *
     *     @Enumerated(EnumType.STRING)
     *     MealType mealType;
     *
     *     @OneToOne
     *     HotelFacilities hotelFacilities;
     * @return
     */
    default boolean isDuplicateOfOther(Trip trip) {
        return false;
    }
}