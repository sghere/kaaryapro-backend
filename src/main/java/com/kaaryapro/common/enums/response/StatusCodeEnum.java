package com.kaaryapro.common.enums.response;

import lombok.Getter;

@Getter
public enum StatusCodeEnum {
  SUCCESS("Success"),
  TECHNICAL_FAILURE("Technical Failure"),
  BAD_REQUEST("Bad Request"),
  REQUIRED_FIELDS_MISSING("Required Fields Missing"),
  AUTHENTICATION_REQUIRED("Authentication required"),
  NO_CONTENT("No Content"),
  ALREADY_EXIST("This name already exists"),
  READ_ONLY_ACCESS("Read Only Access"),
  UNAUTHORIZED_ACCESS("Unauthorized Access"),
  OWNER_ACCESS("Owner Only Access"),
  READ_ONLY_ACCESS_MESSAGE("Some records could not processed due to access issues or invalid IDs. Records are: "),
  READ_ONLY_ALREADY_EXIST_ACCESS_MESSAGE("Some records could not be processed due to access issues, invalid IDs, or non-unique list names. The affected records are: ");


  private final String value;

  StatusCodeEnum(String value) {
    this.value = value;
  }
  public String getValue() {
    return value;
  }
}
