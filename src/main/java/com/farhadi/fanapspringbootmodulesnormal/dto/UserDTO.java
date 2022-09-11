package com.farhadi.fanapspringbootmodulesnormal.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class UserDTO {
    private Long id;
    private String name;
    private String isbn;
}
