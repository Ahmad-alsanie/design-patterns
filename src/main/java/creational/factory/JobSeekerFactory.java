package creational.factory;

public class JobSeekerFactory extends UserFactory {
    public User createUser() {
        return new JobSeeker();
    }
}