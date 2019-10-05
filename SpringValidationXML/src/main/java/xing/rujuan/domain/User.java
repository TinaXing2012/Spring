package xing.rujuan.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class User {

    private String name;
    private String email;
    private Integer age;
    @DateTimeFormat(pattern = "mm-DD-yyyy")
    private LocalDate birthday;
    private String role;
    private Address addr;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Address getAddr() {
        return addr;
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }
}
