package com.farhadi.fanapspringbootmodulesnormal;

import com.farhadi.fanapspringbootmodulesnormal.repositories.core.MyRepositoryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(repositoryBaseClass = MyRepositoryImpl.class)
public class FanapSpringBootModulesNormalApplication {

    public static void main(String[] args) {
        SpringApplication.run(FanapSpringBootModulesNormalApplication.class, args);
    }

}
