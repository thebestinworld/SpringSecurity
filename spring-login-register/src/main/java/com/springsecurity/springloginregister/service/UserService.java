package com.springsecurity.springloginregister.service;

import com.springsecurity.springloginregister.dto.UserRegistrationDto;
import com.springsecurity.springloginregister.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}
