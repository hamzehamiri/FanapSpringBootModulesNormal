package com.farhadi.fanapspringbootmodulesnormal.mappers;

import com.farhadi.fanapspringbootmodulesnormal.dto.UserDTO;
import com.farhadi.fanapspringbootmodulesnormal.entities.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper MAPPER = Mappers.getMapper( UserMapper.class );

    @Mapping(source = "id", target = "id")
    @Mapping(source = "isbn", target = "isbn")
    @Mapping(source = "name", target = "name")
    UserEntity toEntity(UserDTO userDTO);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "isbn", target = "isbn")
    @Mapping(source = "name", target = "name")
    UserDTO toDTO(UserEntity userEntity);
}
