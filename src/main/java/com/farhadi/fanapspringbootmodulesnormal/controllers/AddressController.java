package com.farhadi.fanapspringbootmodulesnormal.controllers;

import com.farhadi.fanapspringbootmodulesnormal.dto.AddressDTO;
import com.farhadi.fanapspringbootmodulesnormal.services.AddressService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    private final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @PostMapping("/create")
    public void create(@Valid @RequestBody AddressDTO addressEntity) {
        addressService.create(addressEntity);
    }

    @DeleteMapping("/delete")
    public void delete(Long id) {
        addressService.delete(id);
    }

    @DeleteMapping("/deleteWithoutParent")
    public void deleteWithoutParent(Long id) {
        addressService.deleteWithoutParent(id);
    }

    @GetMapping("/findAll")
    public List<AddressDTO> findAll() {
        return addressService.findAll();
    }
}
