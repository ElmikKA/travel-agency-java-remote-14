package com.example.travelagency1.converter;

import com.example.travelagency1.dto.HotelFacilitiesDto;
import com.example.travelagency1.entity.HotelFacilities;
import org.springframework.stereotype.Component;



@Component
public class HotelFacilitiesConverter implements Converter<HotelFacilities, HotelFacilitiesDto> {
    private final AttractionConverter attractionConverter;

    public HotelFacilitiesConverter(AttractionConverter attractionConverter) {
        this.attractionConverter = attractionConverter;
    }

    // Till Java 8 implementation
   /* @Override
    public HotelFacilitiesDto fromEntityToDto(HotelFacilities entity) {
        //Better than just return null;
        //throw new NotYetImplementedException();
        List<AttractionDto> attractions = new ArrayList<>();
        for (Attraction attraction : entity.getAttractions()){
            AttractionDto attractionDto = attractionConverter.fromEntityToDto(attraction);
            attractions.add(attractionDto);
        }
        return new HotelFacilitiesDto(attractions, entity.getApartmentFacilities());
    }*/

    //Since Java 8 Style -
    @Override
    public HotelFacilitiesDto fromEntityToDto(HotelFacilities entity) {
        var attractionsDtos= entity.getAttractions()
                .stream()
                .map(attraction -> attractionConverter.fromEntityToDto(attraction))
                .toList();

        return new HotelFacilitiesDto(attractionsDtos, entity.getApartmentFacilities());
    }

    @Override
    public HotelFacilities fromDoToEntity(HotelFacilitiesDto dto) {
        var entities = dto.attractions()
                .stream()
                .map(attractionDto -> attractionConverter.fromDoToEntity(attractionDto))
                .toList();
        return new HotelFacilities(entities, dto.apartmentFacilities());
    }
}
