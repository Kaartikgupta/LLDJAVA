package main.java.com.lld.user_profile;

public class UserProfile {
    public static void main(String[] args) {
        Address address1 = new Address("123 Main St", "Springfield", "12345", "USA");
        User user1 = new User("1","kaartik","azscsz@zczxc.com");

        user1.addAddress(address1);

        System.out.println("User: " + user1.getName());
        for (Address addr : user1.getAddresses()) {
            System.out.println("Address: " + addr.getStreet() + ", " + addr.getCity() + ", " + addr.getZip());
        }
    }
}
