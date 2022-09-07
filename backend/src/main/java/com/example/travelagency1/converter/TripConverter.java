package com.example.travelagency1.converter;
import com.example.travelagency1.dto.TripDto;
import com.example.travelagency1.entity.Trip;
import org.springframework.stereotype.Component;

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
                .cost(trip.getTripEndDate().toString())
                .currency(trip.getTripPrice().getCurrency())
                .typeofTransport(trip.getTypeOfTransport())
                .securityRules(securityRulesDto)
                .paymentType(trip.getTypeOfPayment())
                .mealType(trip.getTypeOfMeal())
                .hotelFacilities(hotelFacilitiesDto)
                .photos(trip.getPhotos())
                .build();
    }

    @Override
    public Trip fromDoToEntity(TripDto tripDto) {
        // TODO
        return null;
    }
}
