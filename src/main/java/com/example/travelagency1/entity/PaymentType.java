package com.example.travelagency1.entity;

public enum PaymentType {
    CASH("Pay with cash"),
    CARD("Visa or Mastercard"),
    TRANSFER("Bank transfer"),
    APPLE_PAY("Pay with Iphone"),
    GOOGLE_PLAY("Pay with Android phone"),
    PAYPAL("Elon would you pay"),
    INSTALLMENT_PAYMENT("Just Installment pay");

    private final String description;

    PaymentType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
