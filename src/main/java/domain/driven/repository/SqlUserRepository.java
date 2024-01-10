package domain.driven.repository;

import java.util.ArrayList;
import java.util.List;

public class SqlUserRepository implements UserRepository {
    // Implementation using SQL database

    public void add(User user) {
        // Code to add user to a SQL database
    }

    public void update(User user) {
        // Code to update user in a SQL database
    }

    public User getById(String id) {
        // Code to get a user by ID from SQL database
        return new User();
    }

    public List<User> getAll() {
        // Code to get all users from SQL database
        return new ArrayList<>();
    }
}
