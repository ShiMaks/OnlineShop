package by.htp.shop.dao;

import by.htp.shop.domain.Order;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderDao implements BaseDao<Order> {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void create(Order order) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(order);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public Order read(int id) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Order order = (Order) session.get(Order.class, id);
        session.getTransaction().commit();
        session.close();
        return order;
    }

    @Override
    public void update(Order order) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(order);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void delete(int id) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Order order = (Order) session.get(Order.class, id);
        if (order != null) {
            session.delete(order);
            session.getTransaction().commit();
        }
        session.close();
    }

    @Override
    public List<Order> readAll() {
        Session session = sessionFactory.openSession();
        List<Order> orders = session.createQuery("FROM Order").list();
        session.close();
        return orders;
    }
}
