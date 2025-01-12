package com.kaaryapro.common.enums.response;

import lombok.Getter;

@Getter
public enum MessageEnum {
  MESSAGE("default");

  private final String value;

  MessageEnum(String value) {
    this.value = value;
  }

  @Getter
  public enum Reveal {
    INVALID_CONTENT("Provide Valid Content");
    private final String value;

    Reveal(String value) {
      this.value = value;
    }
  }
}
