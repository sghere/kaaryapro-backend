package com.kaaryapro.service.common.request;

import com.kaaryapro.common.entity.User;
import com.kaaryapro.common.enums.exception.BusinessException;
import com.kaaryapro.common.enums.response.StatusCodeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.catalina.connector.Response;

import java.util.Objects;
import java.util.stream.Stream;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddServiceRequest {

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void isLeadListCreatesValid(String correlationId) throws BusinessException {
        if (!Stream.of(user)
                .allMatch(Objects::nonNull)) {
            throw new BusinessException(
                    Response.SC_BAD_REQUEST,
                    correlationId,
                    StatusCodeEnum.BAD_REQUEST.getValue());
        }
    }
}
