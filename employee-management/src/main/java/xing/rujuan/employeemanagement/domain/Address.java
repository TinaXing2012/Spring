package xing.rujuan.employeemanagement.domain;


import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    @NotBlank
    @Size(min = 5, max = 20, message = "First Name must be between 5 and 20")
    private String street;

    @Size(min=2, max=2, message = "State only allows 2 characters")
    private String state;
    private String zipCode;

}
