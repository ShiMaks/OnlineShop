package by.htp.shop.dao;

import java.util.List;

import by.htp.shop.domain.BaseEntity;

public interface BaseDao<T extends BaseEntity> {
	
	void create(T t); 
	
	T read(int id);
	
	void update(T t);
	
	void delete(int id);
	
	List<T> readAll();

}
