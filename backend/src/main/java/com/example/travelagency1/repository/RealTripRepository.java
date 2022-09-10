package com.example.travelagency1.repository;

import com.example.travelagency1.entity.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface RealTripRepository extends JpaRepository<Trip, Long> {
}
