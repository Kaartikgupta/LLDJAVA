package main.java.com.lld.design_patterns.repository_pattern.service;

import main.java.com.lld.design_patterns.repository_pattern.domain.User;
import main.java.com.lld.design_patterns.repository_pattern.repository.UserRepository;

import java.util.List;

public class UserService {
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public void registerUser(int id, String name, int age) {
        userRepository.addUser(new User(id, name, age));
    }
    public List<User> getUsers() {
        return userRepository.getAllUsers();
    }
    public User getUserById(int id) {
        return userRepository.getUserById(id);
    }
}
