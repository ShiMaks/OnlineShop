package by.htp.shop.dao;

import java.util.List;

import by.htp.shop.domain.Category;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.CriteriaQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import by.htp.shop.domain.Product;

@Repository
public class ProductDaoImpl implements BaseDao<Product>{

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void create(Product product) {
        execute(new TransactionCallBack() {
            @Override
            public void doInTransaction(Session session) {
                session.save(product);
            }
        });
	}

	@Override
	public Product read(int id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Product product = (Product) session.get(Product.class, id);
		session.getTransaction().commit();
		session.close();
		return product;
	}

	@Override
	public void update(Product product) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(product);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void delete(int id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
        Product product = (Product) session.get(Product.class, id);
		if (product != null) {
            session.delete(product);
            session.getTransaction().commit();
        }
		session.close();
	}

	@Override
	public List<Product> readAll() {
		Session session = sessionFactory.openSession();
		List<Product> products = session.createQuery("FROM Product").list();
		session.close();
		return products;
	}

	public List<Product> findProductsByCategory(int id){
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            Category c = (Category) session.get(Category.class, id);
            List<Product> products = session
                    .createQuery("FROM Product p WHERE p.category=:cat") // Hibernate query language
                    .setParameter("cat", c)
                    .list();
            session.getTransaction().commit();
            return products;
        } finally {
            session.close();
        }
    }

    void execute(TransactionCallBack transactionCallBack){
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            transactionCallBack.doInTransaction(session);
            session.getTransaction().commit();
        } finally {
            session.close();
        }
    }

}