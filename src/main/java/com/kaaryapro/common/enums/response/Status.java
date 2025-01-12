package com.kaaryapro.common.enums.response;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({"statusCode", "requestId", "message", "errorMessage"})
public class Status {
    private int statusCode;
    private String message;
    private String requestId;
    private String errorMessage;

    public Status(int statusCode, String message, String requestId) {
        this.statusCode = statusCode;
        this.message = message;
        this.requestId = requestId;
    }
}
