package com.farhadi.fanapspringbootmodulesnormal.mappers;

import com.farhadi.fanapspringbootmodulesnormal.dto.AddressDTO;
import com.farhadi.fanapspringbootmodulesnormal.entities.AddressEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AddressMapper {
    AddressMapper MAPPER = Mappers.getMapper(AddressMapper.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "address_name", target = "address_name")
    @Mapping(source = "address_type", target = "address_type")
    AddressEntity toEntity(AddressDTO addressDTO);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "address_name", target = "address_name")
    @Mapping(source = "address_type", target = "address_type")
    AddressDTO toDTO(AddressEntity addressEntity);
}
