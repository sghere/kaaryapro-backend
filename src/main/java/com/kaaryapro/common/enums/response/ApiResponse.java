package com.kaaryapro.common.enums.response;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({"status", "data"})
public class ApiResponse {

  private Status status;
  private Object data;

  public ApiResponse(Status status) {
    this.status = status;
  }

}
