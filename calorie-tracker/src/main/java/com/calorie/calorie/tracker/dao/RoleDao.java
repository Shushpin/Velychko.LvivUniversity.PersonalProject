package com.calorie.calorie.tracker.dao;

import com.calorie.calorie.tracker.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Long> {
}
