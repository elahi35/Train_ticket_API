package com.Train_Tickets.Train_Tickets_RestAPI.dao;

import com.Train_Tickets.Train_Tickets_RestAPI.Entities.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsDao extends JpaRepository<UserDetails, Long> {
}
