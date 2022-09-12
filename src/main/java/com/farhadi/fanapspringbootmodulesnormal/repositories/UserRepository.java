package com.farhadi.fanapspringbootmodulesnormal.repositories;

import com.farhadi.fanapspringbootmodulesnormal.entities.UserEntity;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {

}
