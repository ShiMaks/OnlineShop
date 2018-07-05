package by.htp.shop.web;

import by.htp.shop.domain.Product;
import by.htp.shop.service.CategoryService;
import by.htp.shop.service.OrderService;
import by.htp.shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
public class CatalogController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private CategoryService service;

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String prepareIndexPage(Map<String, Object> model) {
        model.put("categories", service.listCategory());
        model.put("productsIndex", productService.listProduct());
        return "index";
    }

    @RequestMapping(value = "/category/{id}", method = RequestMethod.GET)
    public String prepareProductsOfCategory(@PathVariable int id, Map<String, Object> model) {
        model.put("products", productService.findProductsByCategory(id));
        return "category";
    }

    @RequestMapping(value = "/category/product/{id}", method = RequestMethod.GET)
    public String listProduct(@PathVariable int id, Map<String, Object> model) {
        model.put("products", productService.findProductsByCategory(id));
        return "product-list";
    }

    @RequestMapping(value = "/category/product/infproduct/{id}", method = RequestMethod.GET)
    public String informationProduct(@PathVariable int id, Map<String, Object> model) {
        model.put("productInform", productService.getProduct(id));
        return "shop-detail";
    }

//    @RequestMapping(value = "/category/product/infproduct/addCart/{id}", method = RequestMethod.GET)
//    public String addProductToCart(@PathVariable int id, Map<String, Object> model) {
//        model.put("productCart", productService.getProduct(id));
//        model.put("categories", service.listCategory());
//        return "error";
//    }
}