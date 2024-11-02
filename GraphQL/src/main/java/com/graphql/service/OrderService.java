package com.graphql.service;

import com.graphql.entity.Orders;
import com.graphql.entity.User;
import com.graphql.repository.OrderRepository;
import com.graphql.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService implements  IOrderService{

    @Autowired
    OrderRepository orderRepository;

    @Override
    public Orders createOrders(Orders orders) {
        return orderRepository.save(orders);
    }
}
