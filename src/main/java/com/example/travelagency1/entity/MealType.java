package com.example.travelagency1.entity;

public enum MealType {
    BREAKFASTS("Morning Food"),
    LUNCHES("Food for the day"),
    DINNERS("Food for the Evening"),
    SNACKS("If you didn't have enough"),
    DRINKS("Liquid drinks Alcohol/Usual"),
    HB(""),
    ALL_INCLUDED("Full Service");


    private final String mealDescription;

    MealType(String mealDescription) {
        this.mealDescription = mealDescription;
    }

    public String getMealDescription() {
        return mealDescription;
    }
}
