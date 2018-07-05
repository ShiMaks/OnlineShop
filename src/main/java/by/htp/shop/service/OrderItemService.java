package by.htp.shop.service;

import by.htp.shop.domain.OrderItem;

import java.util.List;

public interface OrderItemService {

    void addOrder(OrderItem orderItem);

    void updateOrder(OrderItem orderItem);

    OrderItem getOrderItem(int id);

    void deleteOrderItem(int id);

    List<OrderItem> listOrderItem();
}
