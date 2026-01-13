package main.java.com.lld.design_patterns.builder_pattern;


//Builder is a static nested class because it belongs to the User type, needs access to its private constructor, and should not depend on an existing User instance.
// The User constructor accepts a Builder as a parameter to copy construction state in a controlled way


public class UserApp {
    public static void main(String[] args) {
        User user1 = new User.Builder("kaartik", 30).setCity("New York").setEmail("ssss").build();
        System.out.println("User1: " + user1);
    }
}
