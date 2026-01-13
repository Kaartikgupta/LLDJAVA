package main.java.com.lld.design_patterns.builder_pattern;

public class User {
    private final String name;
    private final String email;
    private final int age;
    private final String city;

    private User(Builder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.age = builder.age;
        this.city = builder.city;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
    public static class Builder {
        private String name;
        private int age;
        private String city;
        private String email;

        public Builder(String name, int age){
            this.name = name;
            this.age = age;
        }
        public Builder setCity(String city){
            this.city = city;
            return this;
        }
        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }
        public User build(){
            return new User(this);
        }
    }

}
