package by.htp.shop.service;

import by.htp.shop.domain.Product;

import java.util.List;


public interface ProductService {

    void addProduct(Product product);

    void updateProduct(Product product);

    Product getProduct(int id);

    void deleteProduct(int id);

    List<Product> listProduct();

    List<Product> findProductsByCategory(int id);
}
