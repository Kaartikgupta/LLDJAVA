package main.java.com.lld.user_profile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class User {
    private final String id;
    private final String name;
    private final String email;
    private final List<Address> addresses;

    public User(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.addresses = new ArrayList<>();
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }

    public List<Address> getAddresses() {
        //addresses are immutable
        return Collections.unmodifiableList(addresses);
    }

    public void addAddress(Address address) {
        if (address == null) {
            throw new IllegalArgumentException("Address cannot be null");
        }
        addresses.add(address);
    }
}