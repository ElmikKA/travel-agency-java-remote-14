package com.example.travelagency1.controller;

import com.example.travelagency1.converter.TripConverter;
import com.example.travelagency1.dto.TripDto;
import com.example.travelagency1.entity.Trip;
import com.example.travelagency1.service.TripService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

//TODO: fix CORS in better way
@CrossOrigin("http://localhost:4200/")
@RestController
@Slf4j
@RequestMapping("/api/trips")
public class TripController {

    private final TripService tripService;

    private final TripConverter tripConverter;

    public TripController(TripService tripService, TripConverter tripConverter) {
        this.tripService = tripService;
        this.tripConverter = tripConverter;
    }

    @GetMapping
    public List<TripDto> getAllTrips(){
        log.info("getting all trips");

        var entities= tripService.findAllTrips();
        return entities.stream()
                .map(trip -> tripConverter.fromEntityToDto(trip))
                .toList();

    }

    @GetMapping("/{id}")
    public TripDto getTripById(@PathVariable("id") Long id){
        log.info("getting trips by id: [{}]", id);


        var entity= tripService.findTripById(id);
        return tripConverter.fromEntityToDto(entity);
    }

    @PostMapping
    public TripDto createNewTrip(@Valid @RequestBody TripDto newTrip){
        log.info("Trying to create new trip: [{}]", newTrip);
        //convert dto to entity
        var toSaveEntity = tripConverter.fromDtoToEntity(newTrip);

        //store into db
        var saved =tripService.createNewTrip(toSaveEntity);

        //convert back to dto
        return tripConverter.fromEntityToDto(saved);
    }

}
