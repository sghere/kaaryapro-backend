package com.kaaryapro.user.controller;

import com.kaaryapro.common.enums.exception.BusinessException;
import com.kaaryapro.common.enums.exception.TechnicalException;
import com.kaaryapro.common.enums.request.ApiRequest;
import com.kaaryapro.common.enums.response.ApiResponse;
import com.kaaryapro.common.enums.util.CustomerUtil;
import com.kaaryapro.user.common.request.AddUserRequest;
import com.kaaryapro.user.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    @Lazy
    private user user;
    @PostMapping("/create-user")
    public ApiResponse createUser(@RequestBody ApiRequest<AddUserRequest> apiRequest) throws BusinessException, TechnicalException {
        String correlationId = CustomerUtil.generateCorrelationId();
        return user.createUser(apiRequest.getData(), correlationId);
    }

}




