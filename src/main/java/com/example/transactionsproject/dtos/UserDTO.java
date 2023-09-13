package com.example.transactionsproject.dtos;

import com.example.transactionsproject.domain.user.UserType;

import java.math.BigDecimal;

public record UserDTO(String firstName, String lastname, String document, BigDecimal balance, String email, String password, UserType userType) {
}
