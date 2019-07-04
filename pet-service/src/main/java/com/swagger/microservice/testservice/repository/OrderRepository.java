package com.swagger.microservice.testservice.repository;

import com.swagger.microservice.testservice.Order;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
@Configuration
public interface OrderRepository extends CrudRepository<Order,Long> {
}
