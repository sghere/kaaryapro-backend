package com.kaaryapro.service.common.utils;

import com.kaaryapro.common.entity.User;
import com.kaaryapro.service.common.request.AddServiceRequest;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ServiceHelper {

    private static final Logger log = LoggerFactory.getLogger(ServiceHelper.class);

    public User createUserEntity(AddServiceRequest userRequest) {
        User user = new User();
        user.setName(userRequest.getUser().getName());
        user.setRole(userRequest.getUser().getRole());
        user.setPhone(userRequest.getUser().getPhone());
        user.setAddress(userRequest.getUser().getAddress());
        user.setEmail(userRequest.getUser().getEmail());
//        user.setCreatedAt(userRequest.getData().getUser().getCreatedAt());
        return user;
    }
}

