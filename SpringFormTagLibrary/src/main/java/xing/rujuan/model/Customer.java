package xing.rujuan.model;

public class Customer {

    private String first;
    private String last;
    private Phone phone;
    private Country country;

    public Customer() {
    }

    public Customer(String first, String last, Phone phone) {
        this.first = first;
        this.last = last;
        this.phone = phone;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
