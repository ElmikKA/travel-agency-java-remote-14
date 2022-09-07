package com.example.travelagency1.converter;
import com.example.travelagency1.dto.TripDto;
import com.example.travelagency1.entity.Price;
import com.example.travelagency1.entity.Trip;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component// are called annotations
public class TripConverter implements Converter<Trip, TripDto> {

    private final DestinationConverter destinationConverter;
    private final SecurityRulesConverter securityRulesConverter;
    private final HotelFacilitiesConverter hotelFacilitiesConverter;

    public TripConverter(DestinationConverter destinationConverter, SecurityRulesConverter securityRulesConverter, HotelFacilitiesConverter hotelFacilitiesConverter) {
        this.destinationConverter = destinationConverter;
        this.securityRulesConverter = securityRulesConverter;
        this.hotelFacilitiesConverter = hotelFacilitiesConverter;
    }

    @Override
    public TripDto fromEntityToDto(Trip trip) {
        var destinationDto = destinationConverter.fromEntityToDto(trip.getDestination());
        var securityRulesDto = securityRulesConverter.fromEntityToDto(trip.getRulesOfSecurity());
        var hotelFacilitiesDto = hotelFacilitiesConverter.fromEntityToDto(trip.getHotelFacilities());

        return TripDto.builder()
                .tripStartDate(trip.getTripStartDate())
                .tripEndDate(trip.getTripEndDate())
                .destination(destinationDto)
                .cost(trip.getTripPrice().toString())
                .cost(trip.getTripPrice().getCurrency())
                .typeofTransport(trip.getTypeOfTransport())
                .securityRules(securityRulesDto)
                .paymentType(trip.getTypeOfPayment())
                .mealType(trip.getTypeOfMeal())
                .hotelFacilities(hotelFacilitiesDto)
                .photos(trip.getPhotos())
                .build();
    }

    @Override
    public Trip fromDtoToEntity(TripDto tripDto) {

        var destinationEntity = destinationConverter.fromDtoToEntity(tripDto.destination());
        var tripPrice = new Price(new BigDecimal(tripDto.cost()), tripDto.currency());
        var securityRulesEntity = securityRulesConverter.fromDtoToEntity(tripDto.securityRules());
        var hotelFacilitiesEntity = hotelFacilitiesConverter.fromDtoToEntity(tripDto.hotelFacilities());

        return Trip.builder()
                .tripStartDate(tripDto.tripStartDate())
                .tripEndDate(tripDto.tripEndDate())
                .destination(destinationEntity)
                .tripPrice(tripPrice)
                .typeOfTransport(tripDto.typeofTransport())
                .rulesOfSecurity(securityRulesEntity)
                .typeOfPayment(tripDto.paymentType())
                .typeOfMeal(tripDto.mealType())
                .hotelFacilities(hotelFacilitiesEntity)
                .photos(tripDto.photos())
                .build();
    }
}
