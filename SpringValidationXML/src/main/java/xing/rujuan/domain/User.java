package xing.rujuan.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.time.LocalDate;
import java.util.Date;

public class User {

    @Size(min=2, max=30, message="Size of the Name must be lie between 2 and 30")
    private String name;

    @Email(message = "Email must follow the formatter: ***@***")
    @NotBlank(message = "Email must have a value")
    private String email;

    @Min(value = 18, message = "must be greater or equal to 18")
    @NotNull(message = "Age is a required field.")
    private Integer age;

    @NotNull(message = "birthday is a required field.")
    @DateTimeFormat(pattern = "MM-dd-yyyy")
    private LocalDate birthday;

    @NotBlank(message = "Role must have a value")
    private String role;

    @Valid
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
