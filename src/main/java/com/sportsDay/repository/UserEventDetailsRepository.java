package com.sportsDay.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sportsDay.model.UserEventDetails;

@Repository
public interface UserEventDetailsRepository extends JpaRepository<UserEventDetails, String> {
	
	@Query("SELECT u.id, u.eventId, p.eventName, p.startTime, p.endTime, p.eventCategory FROM "
			+ "UserEventDetails u inner join EventDetails p "
			+ "on u.eventId = p.eventId where u.userId=:id")
	List<Object> findByUserId(@Param("id") String userId);
	
	@Query("SELECT max(id) FROM UserEventDetails")
	Integer findMaxId();
	
	
	@Query("SELECT eventId FROM UserEventDetails where userId=:id")
	List<String> findAllEventIdsForUserId(@Param("id") String userId);
	
	@Modifying
    @Query(value = "INSERT INTO user_event_details (id, user_id, event_id) "
    		+ "VALUES (:id, :a, :b)", nativeQuery = true)
	@Transactional
    void registerEvent(@Param("id") int id,
    		@Param("a") String userId, 
    		@Param("b") String eventId);
	
	@Modifying
	@Query("DELETE UserEventDetails where eventId=:eventId and userId=:userId")
	@Transactional
	void deleteByUserIdAndEventId(@Param("eventId") String eventId, @Param("userId") String userId);
	


}
