package by.htp.shop.domain;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import java.util.HashMap;
import java.util.Map;

@Component
@Scope(value= WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ShopCart {

    private Map<Product, Integer> products = new HashMap<>();

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public void setProducts(Map<Product, Integer> products) {
        this.products = products;
    }

    public void addProduct(Product product, int count) {
        if(products.containsKey(product)){
            products.put(product, products.get(product) + count);
        } else {
            products.put(product, count);
        }
    }

    public void removeProduct(Product product){
        products.remove(product);
    }

    public void cleanCart(){
        products.clear();
    }

    public int getTotalCost(){
        int totalCost = 0;
        for(Product product: products.keySet()){
            totalCost =+ product.getPrice();
        }
        return totalCost;
    }
}
