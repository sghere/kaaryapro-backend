package com.kaaryapro.common.enums.request;

import com.kaaryapro.common.enums.exception.BusinessException;
import com.kaaryapro.common.enums.response.StatusCodeEnum;
import lombok.Data;
import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Objects;
import java.util.stream.Stream;

@Data
public class ApiRequest<T> {
  private T data;
  private String type;
  private Pagination pagination;

  public void isValid(String correlationId) throws BusinessException {
    if (!Stream.of(data, type).allMatch(Objects::nonNull)) {
      throw new BusinessException(
              Response.SC_BAD_REQUEST,
          correlationId,
          StatusCodeEnum.REQUIRED_FIELDS_MISSING.getValue());
    }
  }

  public void isValidData(String correlationId) throws BusinessException {
    if (!Stream.of(data).allMatch(Objects::nonNull)) {
      throw new BusinessException(
              Response.SC_BAD_REQUEST,
          correlationId,
          StatusCodeEnum.REQUIRED_FIELDS_MISSING.getValue());
    }
  }
  public void isValidPagination(String correlationId) throws BusinessException {
    if (!Stream.of(pagination).allMatch(Objects::nonNull)) {
      throw new BusinessException(
              Response.SC_BAD_REQUEST,
              correlationId,
              StatusCodeEnum.REQUIRED_FIELDS_MISSING.getValue());
    }
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }
}
