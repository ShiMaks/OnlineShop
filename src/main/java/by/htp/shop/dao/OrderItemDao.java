package by.htp.shop.dao;

import by.htp.shop.domain.OrderItem;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderItemDao implements BaseDao<OrderItem> {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void create(OrderItem orderItem) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(orderItem);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public OrderItem read(int id) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        OrderItem orderItem = (OrderItem) session.get(OrderItem.class, id);
        session.getTransaction().commit();
        session.close();
        return orderItem;
    }

    @Override
    public void update(OrderItem orderItem) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(orderItem);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void delete(int id) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        OrderItem orderItem = (OrderItem) session.get(OrderItem.class, id);
        if (orderItem != null) {
            session.delete(orderItem);
            session.getTransaction().commit();
        }
        session.close();
    }

    @Override
    public List<OrderItem> readAll() {
        Session session = sessionFactory.openSession();
        List<OrderItem> products = session.createQuery("FROM OrderItem").list();
        session.close();
        return products;
    }
}
