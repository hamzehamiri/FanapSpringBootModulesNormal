package com.farhadi.fanapspringbootmodulesnormal.repositories;

import com.farhadi.fanapspringbootmodulesnormal.entities.AddressEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
//@Transactional(readOnly = true)
public interface AddressRepository extends CrudRepository<AddressEntity, Long> {
    @Query("select a from AddressEntity a where a.user.id = ?1")
    List<AddressEntity> findByUserId(Long userId);

//    @Transactional
    @Override
    void deleteById(Long aLong);
}
