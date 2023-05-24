package com.calorie.calorie.tracker.service;

import com.calorie.calorie.tracker.dao.RoleDao;
import com.calorie.calorie.tracker.dao.UserDao;
import com.calorie.calorie.tracker.model.Role;
import com.calorie.calorie.tracker.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Implementation of {@link UserService} interface.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;
    @Autowired
    private RoleDao roleDao;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Override
    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        Set<Role> roles = new HashSet<>();
        roles.add(roleDao.getOne(1L));
        user.setRoles(roles);
        userDao.save(user);
    }

    @Override
    public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }
}
