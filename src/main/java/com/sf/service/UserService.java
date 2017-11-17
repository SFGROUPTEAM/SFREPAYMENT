package com.sf.service;

import com.sf.model.User;

import java.util.List;


public interface UserService {

    List<User> getAllUser();

    User getUserByPhoneOrEmail(String emailOrPhone, Short state);

    User getUserById(String userId);
}
