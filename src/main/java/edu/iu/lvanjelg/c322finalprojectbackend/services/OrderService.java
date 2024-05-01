package edu.iu.lvanjelg.c322finalprojectbackend.services;

import edu.iu.lvanjelg.c322finalprojectbackend.model.Order;
import edu.iu.lvanjelg.c322finalprojectbackend.repository.OrderRepository;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public int add(Order order) {
        Order saved = orderRepository.save(order);
        return saved.getId();
    }

    public List<Order> findAllByCustomer(String username) {
        List<Order> orders = orderRepository.findAllByCustomerUserName(username);
        return orders;
    }

    public List<Order> search(Order order) {
        Example<Order> example = Example.of(order);
        List<Order> orders = (List<Order>) orderRepository.findAll(example);
        return orders;
    }
}
