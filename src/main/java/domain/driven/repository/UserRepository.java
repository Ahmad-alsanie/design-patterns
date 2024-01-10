package domain.driven.repository;

import java.util.List;

public interface UserRepository {
    void add(User user);
    void update(User user);
    User getById(String id);
    List<User> getAll();
}

