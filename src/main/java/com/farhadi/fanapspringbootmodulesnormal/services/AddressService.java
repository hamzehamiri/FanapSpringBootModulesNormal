package com.farhadi.fanapspringbootmodulesnormal.services;

import com.farhadi.fanapspringbootmodulesnormal.entities.AddressEntity;
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
    public void create(AddressEntity addressEntity) {
        addressRepository.save(addressEntity);
    }

    @Transactional(Transactional.TxType.REQUIRED)
    public void delete(Long id) {
        addressRepository.deleteById(id);
    }

    @Transactional(Transactional.TxType.REQUIRED)
    public List<AddressEntity> findAll() {
        return (List<AddressEntity>) addressRepository.findAll();
    }
}
