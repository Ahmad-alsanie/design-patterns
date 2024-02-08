package com.sanie.creational.factory;

public class UserRegistrationService {
    private UserFactory userFactory;

    public UserRegistrationService(UserFactory userFactory) {
        this.userFactory = userFactory;
    }

    public void registerUser() {
        User user = userFactory.createUser();
        user.register();
        user.createProfile();
    }

    public static void main(String[] args) {
        UserRegistrationService jobSeekerRegistration = new UserRegistrationService(new JobSeekerFactory());
        jobSeekerRegistration.registerUser();

        UserRegistrationService employerRegistration = new UserRegistrationService(new EmployerFactory());
        employerRegistration.registerUser();
    }
}
