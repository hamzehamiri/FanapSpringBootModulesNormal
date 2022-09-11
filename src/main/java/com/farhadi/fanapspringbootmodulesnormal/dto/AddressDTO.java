package com.farhadi.fanapspringbootmodulesnormal.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class AddressDTO {
    private Long id;
    private String address_type;
    private String address_name;
}
