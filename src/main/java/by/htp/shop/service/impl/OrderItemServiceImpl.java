package by.htp.shop.service.impl;

import by.htp.shop.dao.OrderItemDao;
import by.htp.shop.domain.OrderItem;
import by.htp.shop.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemServiceImpl implements OrderItemService {

    @Autowired
    private OrderItemDao orderItemDao;

    @Override
    public void addOrder(OrderItem orderItem) {
        this.orderItemDao.create(orderItem);
    }

    @Override
    public void updateOrder(OrderItem orderItem) {
        this.orderItemDao.update(orderItem);
    }

    @Override
    public OrderItem getOrderItem(int id) {
        return this.orderItemDao.read(id);
    }

    @Override
    public void deleteOrderItem(int id) {
        this.orderItemDao.delete(id);
    }

    @Override
    public List<OrderItem> listOrderItem() {
        return this.orderItemDao.readAll();
    }
}
