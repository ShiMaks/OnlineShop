package by.htp.shop.web;

import by.htp.shop.domain.OrderItem;
import by.htp.shop.domain.Product;
import by.htp.shop.domain.ShopCart;
import by.htp.shop.service.CategoryService;
import by.htp.shop.service.OrderService;
import by.htp.shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@SessionAttributes("products")
public class CartController {

    @Autowired
    private ShopCart cart;

    @Autowired
    private ProductService productService;

    @Autowired
    private OrderService orderService;

    @Autowired
    private CategoryService service;

//    @RequestMapping(value ="/cart{id}", method = RequestMethod.GET)
//    public String addproductInCart(@PathVariable int id, Map<String, Object> model){
//        System.out.println("Enter");
//        Product product = productService.getProduct(id);
//        model.put("productCart", product);
//        System.out.println("Enter");
//        return "cart";
//    }

    @RequestMapping(value ="/category/product/infproduct/addCart/{id}", method = RequestMethod.GET)
    public String addproductInCart(@PathVariable int id, Map<String, Object> model, HttpSession httpSession){
        int quantity = 1;
        Product product = productService.getProduct(id);
        cart.addProduct(product, quantity);
        httpSession.setAttribute("products", cart);
        model.put("categories", service.listCategory());
        model.put("productsIndex", productService.listProduct());
        return "index";
    }

    @RequestMapping(value ="/cart/show", method = RequestMethod.GET)
    public String showCart(Map<String, Object> model){
        model.put("cart", cart);
        return "customer-order";
    }

    @RequestMapping(value ="/cart/show/order/", method = RequestMethod.GET)
    public String orderItems(Map<String, Object> model){
        List<Product> products = new ArrayList<>();
        for (Map.Entry entry: cart.getProducts().entrySet()) {
            Product product = (Product) entry.getKey();
            products.add(product);
        }
        orderService.addOrder(products);
        model.put("categories", service.listCategory());
        model.put("productsIndex", productService.listProduct());
        return "index";
    }

//    @RequestMapping(method = RequestMethod.GET)
//    public List<Product> cars(){
//        List<Product> cars = new ArrayList<>();
//        cars.add(new Product("Apple"));
//        cars.add(new Product("Sansung"));
//        return cars;
//    }
}
