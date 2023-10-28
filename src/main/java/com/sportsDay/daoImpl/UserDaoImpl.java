package com.sportsDay.daoImpl;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sportsDay.dao.UserDao;
import com.sportsDay.dto.UnRegisterEventRequest;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private EntityManager entityManager;

	@Override
	public void unregisterEvent(UnRegisterEventRequest unregisterEventRequest) {
		int query = (int) entityManager.createQuery("delete UserEventDetails where eventId=:eventId and userId=:userId")
				.setParameter("eventId", unregisterEventRequest.getEventId())
				.setParameter("userId", unregisterEventRequest.getUserId()).executeUpdate();
		System.out.println(query);
		return;

	}

}
