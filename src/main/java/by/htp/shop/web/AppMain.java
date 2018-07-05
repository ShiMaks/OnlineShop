package by.htp.shop.web;

import java.util.List;

import by.htp.shop.dao.CategoryDaoImpl;
import by.htp.shop.domain.Category;

public class AppMain {
	
	public static void main(String[] args) {
	
	//SessionFactory factory = new Configuration().configure().buildSessionFactory();	
	CategoryDaoImpl category = new CategoryDaoImpl();
	List<Category> categories = category.readAll();
	
	for(Category cat: categories) {
		System.out.println(cat.getName());
	 }
	}
}
