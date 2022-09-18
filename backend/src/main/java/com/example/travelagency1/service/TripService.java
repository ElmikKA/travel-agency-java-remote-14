package com.example.travelagency1.service;

import com.example.travelagency1.entity.Trip;
import com.example.travelagency1.exception.TripAlreadyExistsExeptcion;
import com.example.travelagency1.exception.TripNotFoundException;
import com.example.travelagency1.repository.TripRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Slf4j
public class TripService {

    private final TripRepository tripRepository;

    public TripService(TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }

    public List<Trip> findAllTrips() {
        log.info("finding all trips");

        return tripRepository.findAll();
    }

    // FIXME
    public Trip findTripById(Long id) {
        log.info("finding trip by id: [{}]", id);

        if (id != null) {
            throw new TripNotFoundException("no trip with id: " + id);
        }
        return null;
    }

    // treats all sqls as atomic changes
    @Transactional
    public Trip createNewTrip(Trip newTrip) {
        log.info("new trip to save: [{}]", newTrip);
        // +log data
        // +store into datasource
        // validate fields of newTrip
        // +validate duplicates
        if (tripRepository.isDuplicateOfOther(newTrip)) {
            throw new TripNotFoundException("Trip already exists!!!");
        }
        Trip saved = tripRepository.save(newTrip);
        log.info("after saving: [{}]", saved);
        return saved;
    }
}
