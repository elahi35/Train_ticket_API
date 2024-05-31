package com.Train_Tickets.Train_Tickets_RestAPI.services;

import com.Train_Tickets.Train_Tickets_RestAPI.Entities.UserDetails;
import com.Train_Tickets.Train_Tickets_RestAPI.dao.UserDetailsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserDetailsDao userDetailsDao;

    @Autowired
    public UserDetailsServiceImpl(UserDetailsDao userDetailsDao) {
        this.userDetailsDao = userDetailsDao;
    }

    @Override
    public UserDetails addUser(UserDetails userDetails) {
        return userDetailsDao.save(userDetails);
    }

    @Override
    public UserDetails getUserById(Long userId) {
        Optional<UserDetails> userOptional = userDetailsDao.findById(userId);
        return userOptional.orElse(null);
    }

    @Override
    public List<UserDetails> getAllUsers() {
        return userDetailsDao.findAll();
    }

    @Override
    public UserDetails updateUser(Long userId, UserDetails userDetails) {
        Optional<UserDetails> userOptional = userDetailsDao.findById(userId);
        if (userOptional.isPresent()) {
            userDetails.setId(userId);
            return userDetailsDao.save(userDetails);
        }
        return null;
    }

    @Override
    public void removeUser(Long userId) {
        userDetailsDao.deleteById(userId);
    }
}
