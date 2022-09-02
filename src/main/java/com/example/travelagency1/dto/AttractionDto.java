package com.example.travelagency1.dto;

import com.example.travelagency1.entity.enumeration.AgeRestrictions;

import java.util.List;

public record AttractionDto(
        String description,

        AgeRestrictions ageRestrictions,

        List<String>photos
) {
}
