package douglas.dipe.domain.model;

public class Address {
    private int number;
    private String street;
    private String neighborhood;
    private String city;
    private String zipCode;

    public Address(int number, String street, String neighborhood, String city, String zipCode) {
        this.number = number;
        this.street = street;
        this.neighborhood = neighborhood;
        this.city = city;
        this.zipCode = zipCode;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
