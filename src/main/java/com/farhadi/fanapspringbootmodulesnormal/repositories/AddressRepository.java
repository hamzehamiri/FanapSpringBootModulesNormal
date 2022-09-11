package com.farhadi.fanapspringbootmodulesnormal.repositories;

import com.farhadi.fanapspringbootmodulesnormal.entities.AddressEntity;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//@EnableJpaRepositories
public interface AddressRepository extends CrudRepository<AddressEntity, Long> {

}
