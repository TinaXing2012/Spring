package xing.rujuan.employeemanagement.domain;

import lombok.*;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    private Integer id;
    private String firstName;
    private String lastName;
    private Address address;


}
