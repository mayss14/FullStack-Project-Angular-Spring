package com.codeElevate.ServiceBookingSystem.entity;


import com.codeElevate.ServiceBookingSystem.enums.UserRole;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name ="users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    private String lastname;
    private String email;
    private String password;
    private String phone;

    private UserRole role;
}
