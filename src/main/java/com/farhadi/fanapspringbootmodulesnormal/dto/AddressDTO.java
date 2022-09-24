package com.farhadi.fanapspringbootmodulesnormal.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Data
@Setter
@Getter
public class AddressDTO {
    private Long id;
    @Email
    private String address_type;
    private String address_name;
    @Min(10)
    @Max(40)
    private int range_street;
    private UserDTO userDTO;
}
