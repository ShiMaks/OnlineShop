package by.htp.shop.service.impl;

import by.htp.shop.dao.CategoryDaoImpl;
import by.htp.shop.dao.ProductDaoImpl;
import by.htp.shop.domain.Product;
import by.htp.shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDaoImpl productDao;

    @Autowired
    private CategoryDaoImpl categoryDao;

    @Override
    public void addProduct(Product product) {

    }

    @Override
    public void updateProduct(Product product) {

    }

    @Override
    public Product getProduct(int id) {

        return productDao.read(id);
    }

    @Override
    public void deleteProduct(int id) {
        productDao.delete(id);
    }

    @Override
    public List<Product> listProduct() {
        return this.productDao.readAll();
    }

    @Override
    public List<Product> findProductsByCategory(int id) {

        return this.productDao.findProductsByCategory(id);
    }
}
