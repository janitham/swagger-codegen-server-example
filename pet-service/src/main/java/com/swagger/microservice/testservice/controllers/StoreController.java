package com.swagger.microservice.testservice.controllers;

import com.swagger.microservice.testservice.Order;
import io.swagger.api.StoreApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.Map;

@RestController
public class StoreController implements StoreApi {
    @Override
    public ResponseEntity<Void> deleteOrder(@Min(1L) Long orderId) {
        return null;
    }

    @Override
    public ResponseEntity<Map<String, Integer>> getInventory() {
        return null;
    }

    @Override
    public ResponseEntity<Order> getOrderById(@Min(1L) @Max(10L) Long orderId) {
        return null;
    }

    @Override
    public ResponseEntity<Order> placeOrder(@Valid Order body) {
        return null;
    }
}
