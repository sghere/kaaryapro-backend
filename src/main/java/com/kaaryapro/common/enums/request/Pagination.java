package com.kaaryapro.common.enums.request;

import com.kaaryapro.common.enums.exception.BusinessException;
import com.kaaryapro.common.enums.response.StatusCodeEnum;
import lombok.Data;
import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ResponseStatus;

@Data
public class Pagination {
  private Integer pageIndex = 0;
  private Integer pageSize = 0;

  public void isValid(String correlationId) throws BusinessException {
    if (pageSize == 0) {
      throw new BusinessException(
              Response.SC_BAD_REQUEST,
          correlationId,
          StatusCodeEnum.REQUIRED_FIELDS_MISSING.getValue());
    }
  }
}
