package by.htp.shop.dao;

import by.htp.shop.domain.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements BaseDao<User> {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void create(User user) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public User read(int id) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        User user = (User) session.get(User.class, id);
        session.getTransaction().commit();
        session.close();
        return user;
    }

    @Override
    public void update(User user) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(user);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void delete(int id) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        User user = (User) session.get(User.class, id);
        if (user != null) {
            session.delete(user);
            session.getTransaction().commit();
        }
        session.close();
    }

    @Override
    public List<User> readAll() {
        Session session = sessionFactory.openSession();
        List<User> users = session.createQuery("FROM User").list();
        session.close();
        return users;
    }
}
