package ch.hearc.ig.odi.testgit;

public class Address {

    private String streetName;
    private String streetNumber;
    private Integer npa;
    private String location;

    public Address(String streetName, String streetNumber, Integer npa, String location) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.npa = npa;
        this.location = location;
    }

    public Address() {
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public Integer getNpa() {
        return npa;
    }

    public void setNpa(Integer npa) {
        this.npa = npa;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
