package com.calorie.calorie.tracker.dao;

import com.calorie.calorie.tracker.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
