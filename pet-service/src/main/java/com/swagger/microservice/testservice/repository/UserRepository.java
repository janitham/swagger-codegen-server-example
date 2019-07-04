package com.swagger.microservice.testservice.repository;

import com.swagger.microservice.testservice.User;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
@Configuration
public interface UserRepository extends CrudRepository<User,Long> {
}
