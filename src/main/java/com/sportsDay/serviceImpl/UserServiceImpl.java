package com.sportsDay.serviceImpl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportsDay.dao.UserDao;
import com.sportsDay.dto.CreateUserRequest;
import com.sportsDay.dto.LoginRequest;
import com.sportsDay.dto.LoginResponse;
import com.sportsDay.dto.RegisterEventRequest;
import com.sportsDay.dto.RegisterEventResponse;
import com.sportsDay.dto.UnRegisterEventRequest;
import com.sportsDay.dto.UnRegisterEventResponse;
import com.sportsDay.dto.User;
import com.sportsDay.exception.BadRequestException;
import com.sportsDay.exception.NotFoundException;
import com.sportsDay.exception.ServiceRequestFailureException;
import com.sportsDay.model.UserProfile;
import com.sportsDay.repository.UserEventDetailsRepository;
import com.sportsDay.repository.UserProfileRepository;
import com.sportsDay.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Autowired
	private UserProfileRepository userProfileRepository;
	
	@Autowired
	private UserEventDetailsRepository userEventDetailsRepository;

	@Override
	@Transactional
	public LoginResponse doLogin(LoginRequest loginRequest) throws Exception {
		LoginResponse loginResponse = new LoginResponse();
		User user = new User();
		
		try {
			Optional<UserProfile> userProfile = userProfileRepository.findById(loginRequest.getUserId());			
			UserProfile data = userProfile.get();
			user.setUserId(data.getUserId());
			user.setUserContactNumber(data.getContact());
			user.setUserEmailId(data.getEmail());
			user.setUserName(data.getUsername());	
		}catch (Exception e) {
			throw new NotFoundException("User details not found in the system");
		}
		loginResponse.setUser(user);
		return loginResponse;

	}

	@Override
	@Transactional
	public String createUser(CreateUserRequest createUserRequest) {
		userProfileRepository.createUser(createUserRequest.getUserId(), 
				createUserRequest.getUserName(), 
				createUserRequest.getUserPassword(), 
				createUserRequest.getUserContactNumber(),
				createUserRequest.getUserEmailId());
		return createUserRequest.getUserId();
	}

	@Override
	@Transactional
	public RegisterEventResponse registerEvent(RegisterEventRequest registerEventRequest) throws Exception {
		RegisterEventResponse response = new RegisterEventResponse();
		try {
			Integer id = userEventDetailsRepository.findMaxId();
			Integer idd = 0;
			if(id==null) {
				idd=1;
			}else {
				idd = id;
				idd++;
			}
			
			List<String> eventIds = userEventDetailsRepository.findAllEventIdsForUserId(registerEventRequest.getUserId());
			if(eventIds.contains(registerEventRequest.getEventId())) {
				throw new BadRequestException("Event is already added for this user!");
			}
			
			userEventDetailsRepository.registerEvent(idd, 
					registerEventRequest.getUserId(), 
					registerEventRequest.getEventId());
		} catch (Exception e) {
			throw new ServiceRequestFailureException("Event is already added for this user!");
		}
		response.setEventId(registerEventRequest.getEventId());
		response.setUserId(registerEventRequest.getUserId());
		return response;
	}

	@Override
	@Transactional
	public UnRegisterEventResponse unregisterEvent(UnRegisterEventRequest unregisterEventRequest) {
		UnRegisterEventResponse response = new UnRegisterEventResponse();
		try {
//			userEventDetailsRepository.deleteByUserIdAndEventId(unregisterEventRequest.getUserId(), unregisterEventRequest.getEventId());
			userDao.unregisterEvent(unregisterEventRequest);
			response.setEventId(unregisterEventRequest.getEventId());
			response.setUserId(unregisterEventRequest.getUserId());
		} catch (Exception e) {
			throw new ServiceRequestFailureException("Error while deletion!");
		}
		return response;
	}

}