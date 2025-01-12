package com.kaaryapro.common.enums.exception;

import lombok.Getter;

@Getter
public class BusinessException extends Exception {

  private final int status;
  private final String correlationId;

  public BusinessException(int status, String correlationId, String message) {
    super(message);
    this.status = status;
    this.correlationId = correlationId;
  }
}
