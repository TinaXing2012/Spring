package xing.rujuan.thymeleafexpressionsyntax.domain;

public class Address {

    private String street;
    private String zipCode;

    public Address() {
    }

    public Address(String street, String zipCode) {
        this.street = street;
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
