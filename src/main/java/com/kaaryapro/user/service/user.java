package com.kaaryapro.user.service;

import com.kaaryapro.common.enums.exception.BusinessException;
import com.kaaryapro.common.enums.response.ApiResponse;
import com.kaaryapro.user.common.request.AddUserRequest;

public interface user {

    ApiResponse createUser(AddUserRequest userRequest, String correlationId) throws BusinessException;
}
