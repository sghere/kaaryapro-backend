package com.kaaryapro.user.service.serviceImpl;

import com.kaaryapro.common.entity.User;
import com.kaaryapro.common.enums.exception.BusinessException;
import com.kaaryapro.common.enums.log.LogEnum;
import com.kaaryapro.common.enums.response.ApiResponse;
import com.kaaryapro.common.enums.response.Status;
import com.kaaryapro.common.enums.response.StatusCodeEnum;
import com.kaaryapro.common.repository.UserRepository;
import com.kaaryapro.user.common.request.AddUserRequest;
import com.kaaryapro.user.common.utils.UserHelper;
import com.kaaryapro.user.service.user;
import jakarta.transaction.Transactional;
import org.apache.catalina.connector.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class UserService implements user{
    private static final Logger log = LoggerFactory.getLogger(UserService.class);
    @Autowired
    @Lazy
    private user user;
    @Autowired
    private UserHelper userHelper;
    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional
    public ApiResponse createUser(AddUserRequest userRequest, String correlationId) throws BusinessException {
        log.info(LogEnum.ACTIVITY.getValue(), correlationId, "createUser", LogEnum.LogMessage.STARTED.getValue(), userRequest);

        userRequest.isLeadListCreatesValid(correlationId);

        User user = userHelper.createUserEntity(userRequest);
        userRepository.saveAndFlush(user);
        log.info(LogEnum.ACTIVITY.getValue(), correlationId, "createUser", LogEnum.LogMessage.ENDED.getValue());
        return new ApiResponse(new Status(Response.SC_CREATED, StatusCodeEnum.SUCCESS.getValue(), correlationId));
    }
}
