package com.sanie.creational.factory;

public class EmployerFactory extends UserFactory {
    public User createUser() {
        return new Employer();
    }
}
