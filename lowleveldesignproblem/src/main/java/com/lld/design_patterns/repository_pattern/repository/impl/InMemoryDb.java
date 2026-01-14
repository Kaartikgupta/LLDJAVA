package main.java.com.lld.design_patterns.repository_pattern.repository.impl;

import main.java.com.lld.design_patterns.repository_pattern.domain.User;
import main.java.com.lld.design_patterns.repository_pattern.repository.UserRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryDb implements UserRepository {
    private final Map<Integer, User> users = new HashMap<>();
    @Override
    public User getUserById(int id) {
        return users.get(id);
    }

    @Override
    public List<User> getAllUsers() {
        return new ArrayList<>(users.values());
    }

    @Override
    public void addUser(User user) {
         users.put(user.getId(), user);
    }

}
