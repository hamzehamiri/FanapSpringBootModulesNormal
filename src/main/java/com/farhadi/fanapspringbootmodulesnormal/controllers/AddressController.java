package com.farhadi.fanapspringbootmodulesnormal.controllers;

import com.farhadi.fanapspringbootmodulesnormal.entities.AddressEntity;
import com.farhadi.fanapspringbootmodulesnormal.services.AddressService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    private final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @PostMapping("/create")
    public void create(AddressEntity addressEntity) {
        addressService.create(addressEntity);
    }

    @DeleteMapping("/delete")
    public void delete(Long id) {
        addressService.delete(id);
    }

    @GetMapping("/findAll")
    public List<AddressEntity> findAll() {
        return addressService.findAll();
    }
}
