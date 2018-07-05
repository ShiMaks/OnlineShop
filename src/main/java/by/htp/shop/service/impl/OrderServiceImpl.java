package by.htp.shop.service.impl;

import by.htp.shop.dao.OrderDao;
import by.htp.shop.domain.Order;
import by.htp.shop.domain.OrderItem;
import by.htp.shop.domain.Product;
import by.htp.shop.domain.Status;
import by.htp.shop.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Override
    public void addOrder(List<Product> products) {
        int price = 0;
        Order order = new Order();
        List<OrderItem> items = new ArrayList<>();
        for(Product product: products){
            OrderItem orderItem = new OrderItem();
            orderItem.setPrice(product.getPrice());
            orderItem.setQuantity(1);
            orderItem.setProduct(product);
            orderItem.setOrder(order);
            price = price + product.getPrice();
            items.add(orderItem);
        }
        order.setStatus(Status.NEW);
        order.setDataOrder(new Date());
        order.setPrice(price);
        order.setOrderItem(items);
        this.orderDao.create(order);
    }

    @Override
    public void updateOrder(Order order) {
        this.orderDao.update(order);
    }

    @Override
    public Order getOrder(int id) {
        return this.orderDao.read(id);
    }

    @Override
    public void deleteOrder(int id) {
        this.orderDao.delete(id);
    }

    @Override
    public List<Order> listOrders() {
        return this.orderDao.readAll();
    }
}
