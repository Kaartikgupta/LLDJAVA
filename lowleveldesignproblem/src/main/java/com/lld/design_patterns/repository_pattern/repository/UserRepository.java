package main.java.com.lld.design_patterns.repository_pattern.repository;

import main.java.com.lld.design_patterns.repository_pattern.domain.User;

import java.util.List;

public interface UserRepository {
    User getUserById(int id);

    List<User> getAllUsers();
    void addUser(User user);
}
