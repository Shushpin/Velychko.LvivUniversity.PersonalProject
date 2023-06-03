package com.calorie.calorie.tracker.service;

import com.calorie.calorie.tracker.model.User;

/**
 * Service class
 */
public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
