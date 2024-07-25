package com.eduardo.course.services;

import com.eduardo.course.entities.Order;
import com.eduardo.course.entities.User;
import com.eduardo.course.repositories.OrderRepository;
import com.eduardo.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Integer id) {
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }

}
