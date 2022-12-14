package com.example.travelagency1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class HotelFacilities {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @OneToMany(cascade = CascadeType.ALL)
    List<Attraction> attractions;

    @ElementCollection
    @CollectionTable(name = "APARTMENT_FACILITIES")
    @Column(name = "APARTMENT_FACILITY")
    List<String> apartmentFacilities;
}
