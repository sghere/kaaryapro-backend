package com.kaaryapro.rating.common.enums;

import lombok.Getter;

@Getter
public enum RatingEnums {
    // Generic
    WORKER_ROLE("WORKER"),
    CUSTOMER_ROLE("CUSTOMER"),
    // Methods for Lead Lists
    METHOD1("Lead Lists"),
    METHOD2("Lead List Save"),
    METHOD3("Lead Details"),
    METHOD4("List of Shared Users"),
    METHOD5("Shared Users Details"),
    METHOD6("Delete Lead Records"),
    METHOD7("Lead Lists Name"),
    METHOD8("Leads Export"),
    METHOD9("Lead List By RevealId");


    private final String value;
    RatingEnums(String value) {
        this.value = value;
    }
}
