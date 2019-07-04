package com.swagger.microservice.testservice.repository;

import com.swagger.microservice.testservice.Pet;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
@Configuration
public interface PetRepository extends CrudRepository<Pet, Long> {
}
