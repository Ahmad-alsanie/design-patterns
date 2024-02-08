package com.sanie.driven.repository;

public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository repository) {
        this.userRepository = repository;
    }

    public void registerUser(User user) {
        userRepository.add(user);
        // Additional business logic
    }

}

