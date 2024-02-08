package com.sanie.creational.factory;

public class Employer implements User {
    public void register() {
        System.out.println("Registering an employer.");
    }

    public void createProfile() {
        System.out.println("Creating an employer profile.");
    }
}