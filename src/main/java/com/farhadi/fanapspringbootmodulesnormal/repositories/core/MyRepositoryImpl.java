package com.farhadi.fanapspringbootmodulesnormal.repositories.core;

import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import javax.persistence.EntityManager;

public class MyRepositoryImpl<T, ID> extends SimpleJpaRepository<T, ID> {
    public MyRepositoryImpl(JpaEntityInformation<T, ?> entityInformation, EntityManager entityManager) {
        super(entityInformation, entityManager);
    }

    public MyRepositoryImpl(Class<T> domainClass, EntityManager em) {
        super(domainClass, em);
    }

    @Override
    public <S extends T> S save(S entity) {
        return super.save(entity);
    }
}
