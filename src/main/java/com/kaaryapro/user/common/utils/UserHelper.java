package com.kaaryapro.user.common.utils;

import com.kaaryapro.common.entity.User;
import com.kaaryapro.user.common.request.AddUserRequest;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class UserHelper {

    private static final Logger log = LoggerFactory.getLogger(UserHelper.class);

    public User createUserEntity(AddUserRequest userRequest) {
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

