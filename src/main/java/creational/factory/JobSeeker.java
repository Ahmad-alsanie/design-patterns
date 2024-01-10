package creational.factory;

public class JobSeeker implements User {
    public void register() {
        System.out.println("Registering a job seeker.");
    }

    public void createProfile() {
        System.out.println("Creating a job seeker profile.");
    }
}
