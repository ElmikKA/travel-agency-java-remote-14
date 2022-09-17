package com.example.travelagency1.repository;

import org.springframework.context.annotation.Profile;


@Profile("!develop")
public interface RealTripRepository extends TripRepository {

    boolean isDuplicateOfOther();
}
