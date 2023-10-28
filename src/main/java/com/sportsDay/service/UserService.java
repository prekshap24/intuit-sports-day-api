package com.sportsDay.service;


import com.sportsDay.dto.CreateUserRequest;
import com.sportsDay.dto.LoginRequest;
import com.sportsDay.dto.LoginResponse;
import com.sportsDay.dto.RegisterEventRequest;
import com.sportsDay.dto.RegisterEventResponse;
import com.sportsDay.dto.UnRegisterEventRequest;
import com.sportsDay.dto.UnRegisterEventResponse;

public interface UserService {

	LoginResponse doLogin(LoginRequest loginRequest) throws Exception;

	String createUser(CreateUserRequest createUserRequest);

	RegisterEventResponse registerEvent(RegisterEventRequest registerEventRequest) throws Exception;

	UnRegisterEventResponse unregisterEvent(UnRegisterEventRequest unregisterEventRequest);

}
