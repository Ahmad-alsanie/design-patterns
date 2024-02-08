package com.sanie.creational.factory;

public class JobSeekerFactory extends UserFactory {
    public User createUser() {
        return new JobSeeker();
    }
}