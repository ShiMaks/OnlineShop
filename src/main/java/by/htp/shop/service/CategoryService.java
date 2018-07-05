package by.htp.shop.service;

import java.util.List;

import by.htp.shop.domain.Category;

public interface CategoryService {
	
	void addCategory(Category category);
	
	void updateCategory(Category category);
	
	Category getCategory(int id);
	
	void deleteCategory(int id);
	
	List<Category> listCategory();

}
