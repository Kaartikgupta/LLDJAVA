package main.java.com.lld.user_profile;
import java.util.ArrayList;
import java.util.List;

public final class Address {
    // make all properties here immutable
    private final String street;
    private final String city;
    private final String zip;
    private final String country;

    public Address(String street, String city, String zip, String country) {
        this.street = street;
        this.city = city;
        this.zip = zip;
        this.country = country;
    }

    public String getStreet() { return street; }
    public String getCity() { return city; }
    public String getZip() { return zip; }
    public String getCountry() { return country; }
}
