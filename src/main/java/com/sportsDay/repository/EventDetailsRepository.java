package com.sportsDay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sportsDay.model.EventDetails;

@Repository
public interface EventDetailsRepository extends JpaRepository<EventDetails, String> {

}