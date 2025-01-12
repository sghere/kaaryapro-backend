package com.kaaryapro.common.enums.exception;

import lombok.Getter;

@Getter
public class TechnicalException extends Exception {
  private final int status;
  private final String correlationId;

  public TechnicalException(int status, String correlationId) {
    this.status = status;
    this.correlationId = correlationId;
  }

  public TechnicalException(int status, String correlationId, String message) {
    super(message);
    this.status = status;
    this.correlationId = correlationId;
  }

  public TechnicalException(int status, String correlationId, String message, Throwable cause) {
    super(message, cause);
    this.status = status;
    this.correlationId = correlationId;
  }
}
