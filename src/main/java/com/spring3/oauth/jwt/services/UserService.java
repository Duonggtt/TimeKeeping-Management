package com.spring3.oauth.jwt.services;

import com.spring3.oauth.jwt.models.dtos.UserRequest;
import com.spring3.oauth.jwt.models.dtos.UserResponse;

import java.util.List;


public interface UserService {

    UserResponse saveUser(UserRequest userRequest);

    UserResponse getUser();

    List<UserResponse> getAllUser();


}
