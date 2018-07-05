package by.htp.shop.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import by.htp.shop.domain.Category;

@Repository("categoryDao")
public class CategoryDaoImpl implements BaseDao<Category> {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void create(Category category) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(category);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public Category read(int id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Category category = (Category) session.get(Category.class, id);
		session.getTransaction().commit();
		session.close();
		return category;
	}

	@Override
	public void update(Category category) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(category);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void delete(int id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.delete(new Category(id));
		session.getTransaction().commit();
		session.close();
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Category> readAll() {
		Session session = sessionFactory.openSession();
		List<Category> categories = session.createQuery("FROM Category").list();
		session.close();
		return categories;
	}

	void execute(TransactionCallBack transactionCallBack){

	}

}
