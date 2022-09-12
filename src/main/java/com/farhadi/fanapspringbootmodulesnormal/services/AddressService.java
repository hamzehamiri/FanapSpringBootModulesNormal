package com.farhadi.fanapspringbootmodulesnormal.services;

import com.farhadi.fanapspringbootmodulesnormal.dto.AddressDTO;
import com.farhadi.fanapspringbootmodulesnormal.entities.AddressEntity;
import com.farhadi.fanapspringbootmodulesnormal.mappers.AddressMapper;
import com.farhadi.fanapspringbootmodulesnormal.repositories.AddressRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class AddressService {

    private final AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Transactional(Transactional.TxType.REQUIRED)
    public void create(AddressDTO addressDTO) {
        AddressEntity entity = AddressMapper.MAPPER.toEntity(addressDTO);
        addressRepository.save(entity);
    }

    @Transactional(Transactional.TxType.REQUIRED)
    public void delete(Long id) {
        addressRepository.deleteById(id);
    }

    @Transactional(Transactional.TxType.REQUIRED)
    public List<AddressDTO> findAll() {
        List<AddressEntity> listAddress = (List<AddressEntity>) addressRepository.findAll();
        return AddressMapper.MAPPER.toDTOs(listAddress);
    }
}
