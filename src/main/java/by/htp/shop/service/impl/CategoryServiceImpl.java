package by.htp.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import by.htp.shop.dao.BaseDao;
import by.htp.shop.domain.Category;
import by.htp.shop.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	private BaseDao<Category> categoryDao;

	@Autowired(required = true)
	@Qualifier(value = "categoryDao")
	public void setCategoryDao(BaseDao<Category> categoryDao) {
		this.categoryDao = categoryDao;
	}

	@Override
	public void addCategory(Category category) {
		this.categoryDao.create(category);
	}

	@Override
	public void updateCategory(Category category) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Category getCategory(int id) {

		return this.categoryDao.read(id);
	}

	@Override
	public void deleteCategory(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Category> listCategory() {
		return this.categoryDao.readAll();
	}

}
