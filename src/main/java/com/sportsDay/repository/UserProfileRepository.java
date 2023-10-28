package com.sportsDay.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sportsDay.model.UserProfile;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile, String>{
	
	@Modifying
    @Query(value = "INSERT INTO user_profile (user_id, username, password, contact, email) "
    		+ "VALUES ( :a, :b, :c, :d, :e)", nativeQuery = true)
    @Transactional
    void createUser(@Param("a") String userId, 
    		@Param("b") String username,
    		@Param("c") String password,
    		@Param("d") String contact,
    		@Param("e") String email);

}