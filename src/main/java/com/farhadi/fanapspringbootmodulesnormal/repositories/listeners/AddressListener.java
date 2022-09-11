package com.farhadi.fanapspringbootmodulesnormal.repositories.listeners;

import com.farhadi.fanapspringbootmodulesnormal.entities.AddressEntity;
import com.farhadi.fanapspringbootmodulesnormal.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.PostRemove;
import javax.transaction.Transactional;

@Component
public class AddressListener {

    @Autowired
    private UserRepository userRepository;

    @PostRemove
    @Transactional(Transactional.TxType.REQUIRED)
    public void postRemove(AddressEntity object) {
        System.out.println("object = " + object);
    }

}