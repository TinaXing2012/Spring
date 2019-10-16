package xing.rujuan.employeemanagement.domain;

import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @NotNull(message = "Id cannot be Null")
    private Integer id;

    @NotBlank
    @Size(min = 2, max = 18, message = "First Name must be between 2 and 18")
    private String firstName;
    private String lastName;

    @Valid
    private Address address;


}
