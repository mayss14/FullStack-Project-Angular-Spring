package com.codeElevate.ServiceBookingSystem.services.authentication;


import com.codeElevate.ServiceBookingSystem.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements  AuthService{

    @Autowired
    private UserRepo userRepository;
}
