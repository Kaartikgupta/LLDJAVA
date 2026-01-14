package main.java.com.lld.design_patterns.repository_pattern.app;

import main.java.com.lld.design_patterns.repository_pattern.repository.UserRepository;
import main.java.com.lld.design_patterns.repository_pattern.repository.impl.InMemoryDb;
import main.java.com.lld.design_patterns.repository_pattern.service.UserService;

public class UserApp {
    public static void main(String[] args) {
        System.out.println("User Application Started");
        UserRepository userRepository = new InMemoryDb();
        UserService userService = new UserService(userRepository);
        userService.registerUser(1, "John Doe", 12);

        userService.registerUser(2, "Jane Bane", 23);

        System.out.println(userService.getUserById(1).getName());
        userService.getUsers().forEach(u->System.out.println(u.getAge()));
        System.out.println("User Application Ended");
    }
}
