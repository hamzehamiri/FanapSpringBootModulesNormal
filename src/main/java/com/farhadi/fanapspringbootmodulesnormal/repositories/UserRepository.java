package com.farhadi.fanapspringbootmodulesnormal.repositories;

import com.farhadi.fanapspringbootmodulesnormal.entities.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.orm.jpa.JpaSystemException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {
//    @Transactional(noRollbackFor = JpaSystemException.class)
    @Query(value = "delete from cool_schema.user u where (select count(a.id) from cool_schema.address a where a.user_id = ?1) = 0 and u.id=?1" , nativeQuery = true)
    void deleteByCustomID(Long userID);
}
