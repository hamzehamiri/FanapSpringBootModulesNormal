package com.farhadi.fanapspringbootmodulesnormal.services;

import com.farhadi.fanapspringbootmodulesnormal.entities.UserEntity;
import com.farhadi.fanapspringbootmodulesnormal.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Transactional(Transactional.TxType.REQUIRED)
    public UserEntity addUser(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

    @Transactional(Transactional.TxType.REQUIRED)
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

    @Transactional(Transactional.TxType.REQUIRED)
    public List<UserEntity> findAll() {
        return (List<UserEntity>) userRepository.findAll();
    }
}
