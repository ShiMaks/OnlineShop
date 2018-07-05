package by.htp.shop.service;

import by.htp.shop.domain.Order;
import by.htp.shop.domain.Product;

import java.util.List;

public interface OrderService {

    void addOrder(List<Product> products);

    void updateOrder(Order order);

    Order getOrder(int id);

    void deleteOrder(int id);

    List<Order> listOrders();
}
