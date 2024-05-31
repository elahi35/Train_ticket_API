package com.Train_Tickets.Train_Tickets_RestAPI.services;

import com.Train_Tickets.Train_Tickets_RestAPI.Entities.UserDetails;

import java.util.List;

public interface UserDetailsService {
    UserDetails addUser(UserDetails userDetails);

    UserDetails getUserById(Long userId);

    List<UserDetails> getAllUsers();

    UserDetails updateUser(Long userId, UserDetails userDetails);

    void removeUser(Long userId);
}
