package com.farhadi.fanapspringbootmodulesnormal.repositories;

import com.farhadi.fanapspringbootmodulesnormal.entities.UserEntity;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

//@EnableJpaRepositories
public interface UserRepository extends CrudRepository<UserEntity, Long> {

}
