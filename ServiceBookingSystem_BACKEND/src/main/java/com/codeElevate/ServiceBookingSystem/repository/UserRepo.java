package com.codeElevate.ServiceBookingSystem.repository;

import com.codeElevate.ServiceBookingSystem.entity.User;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
}
