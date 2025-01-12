package com.kaaryapro.user.common.enums;

import lombok.Getter;

@Getter
public enum UserEnums {
    // Generic
    WORKER_ROLE("WORKER"),
    CUSTOMER_ROLE("CUSTOMER"),
    HANDPICKED("Handpicked"),
    // Methods for Lead Lists
    METHOD1("Lead Lists"),
    METHOD2("Lead List Save"),
    METHOD3("Lead Details"),
    METHOD4("List of Shared Users"),
    METHOD5("Shared Users Details"),
    METHOD6("Delete Lead Records"),
    METHOD7("Lead Lists Name"),
    METHOD8("Leads Export"),
    METHOD9("Lead List By RevealId"),

    // DB params
    TIMESTAMP("timeStamp"),
    REVEALTIMESTAMP("revealTimestamp"),
    START_DATE("startDate"),
    END_DATE("endDate"),
    EXPORT("export");


    private final String value;
    UserEnums(String value) {
        this.value = value;
    }
}
