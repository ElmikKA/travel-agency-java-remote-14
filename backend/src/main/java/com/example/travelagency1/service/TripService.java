package com.example.travelagency1.service;

import com.example.travelagency1.entity.Trip;
import com.example.travelagency1.exception.TripNotFoundException;
import com.example.travelagency1.repository.RealTripRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@Slf4j
public class TripService {

    private final RealTripRepository tripRepository;

    public TripService(RealTripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }

    public List<Trip> findAllTrips() {
        log.info("finding all trips");

        return tripRepository.findAll();
    }

    public Trip findTripByID(Long id) {
        log.info("finding trip by id: [{}]", id);

        if (id != null){
            throw new TripNotFoundException("no trip with id: " + id);
        }
        return null;
    }
}
