package com.example.travelagency1.repository;

import com.example.travelagency1.entity.Trip;
import org.springframework.context.annotation.Profile;


@Profile("!develop")
public interface RealTripRepository extends TripRepository {

     default boolean isDuplicateOfOther(){
        return false;
    }


}
