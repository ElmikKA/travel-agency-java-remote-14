package com.example.travelagency1.entity;

import com.example.travelagency1.entity.enumeration.AgeRestrictions;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Attraction {

    String description;

    AgeRestrictions ageRestrictions;

    List<String> photos;
}
