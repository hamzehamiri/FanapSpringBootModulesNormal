package com.farhadi.fanapspringbootmodulesnormal.repositories.listeners;

import com.farhadi.fanapspringbootmodulesnormal.entities.AddressEntity;
import org.springframework.stereotype.Service;

import javax.persistence.PostRemove;
import javax.transaction.Transactional;

@Service
public class AddressListener {

    @PostRemove
    public void postRemove(AddressEntity object) {
        System.out.println("dd");
    }

}