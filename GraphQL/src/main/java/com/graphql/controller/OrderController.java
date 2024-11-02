package com.graphql.controller;

import com.graphql.entity.Orders;
import com.graphql.service.IOrderService;
import com.graphql.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class OrderController {

    @Autowired
    private IOrderService orderService;

    @MutationMapping
    public Orders createOrders(@Argument String details, @Argument String address ,@Argument int price)
    {
         Orders orders=new Orders();

         orders.setDetails(details);
         orders.setAddress(address);
         orders.setPrice(price);
        return orderService.createOrders(orders);

    }

}
