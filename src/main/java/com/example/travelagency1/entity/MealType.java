package com.example.travelagency1.entity;

public enum MealType {
    BREAKFASTS(""),
    LUNCHES(""),
    DINNERS(""),
    SNACKS(""),
    DRINKS(""),
    HB(""),
    ALL_INCLUDED("");


    private final String mealDescription;

    MealType(String mealDescription) {
        this.mealDescription = mealDescription;
    }

    public String getMealDescription() {
        return mealDescription;
    }
}
