package by.htp.shop.web;

import by.htp.shop.domain.Order;
import by.htp.shop.domain.Product;
import by.htp.shop.domain.Status;
import by.htp.shop.service.CategoryService;
import by.htp.shop.service.impl.OrderServiceImpl;
import by.htp.shop.service.impl.ProductServiceImpl;
import by.htp.shop.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class AdminController {

    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private OrderServiceImpl orderService;

    @Autowired
    private ProductServiceImpl productService;

    @Autowired
    private CategoryService service;

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String prepareAdminPage(Map<String, Object> model){
        model.put("users", userService.listUsers());
      //  model.put("orders",orderService.listOrders());
        return "dashboard";
    }

    @RequestMapping(value = "/admin/products", method = RequestMethod.GET)
    public String prepareCategoriesForAdmin(Map<String, Object> model){
        model.put("products", productService.listProduct());
        return "adminProducts";
    }

    @RequestMapping(value = "/admin/products/delete/{id}", method = RequestMethod.GET)
    public String deleteProduct(@PathVariable int id, Map<String, Object> model){
        productService.deleteProduct(id);
        model.put("products", productService.listProduct());
        return "adminProducts";
    }

    @RequestMapping(value = "/admin/products/update/{id}", method = RequestMethod.GET)
    public String prepareUpdateProduct(@PathVariable int id, Map<String, Object> model){
        //productService.updateProduct();
        return "adminUpdateProduct";
    }

    @RequestMapping(value = "/admin/products/update/{id}/{picture}/{description}/{inStock}/{price}/{category}", method = RequestMethod.GET)
    public String updateProduct(@PathVariable("id") int id, Map<String, Object> model){
        //productService.updateProduct();
        return "adminUpdateProduct";
    }

    @RequestMapping(value = "/admin/category/delete/{id}", method = RequestMethod.GET)
    public String deleteCategory(@PathVariable int id, Map<String, Object> model){
        service.deleteCategory(id);
        model.put("categories", service.listCategory());
        return "adminCategories";
    }

    @RequestMapping(value = "/admin/orders", method = RequestMethod.GET)
    public String prepareOrdersForAdmin(Map<String, Object> model){
        List<String> actions = new ArrayList<>();
        actions.add("NEW");
        actions.add("PAYED");
        actions.add("DELIVERED");
        actions.add("CANCELLED");
        model.put("orders", orderService.listOrders());
        model.put("actions", actions);
        return "adminOrders";
    }

    @RequestMapping(value = "/admin/orders/order/{id}", method = RequestMethod.GET)
    public String prepareOrderForAdmin(@PathVariable int id, Map<String, Object> model){
        model.put("order", orderService.getOrder(id));
        return "adminOrder";
    }

    @RequestMapping(value = "/admin/orders/order/handle/{id}/{value}", method = RequestMethod.GET)
    public String handleOrder(@PathVariable int id,@PathVariable String value, Map<String, Object> model){
        System.out.println(value);
        Order order = orderService.getOrder(id);
        if(value.equals(Status.PAYED)){
            order.setStatus(Status.PAYED);
        } else if(value.equals(Status.CANCELLED)){
            order.setStatus(Status.CANCELLED);
        } else if(value.equals(Status.DELIVERED)){
            order.setStatus(Status.DELIVERED);
        } else {
            order.setStatus(Status.NEW);
        }
        orderService.updateOrder(order);
        model.put("orders", orderService.listOrders());
        return "adminOrder";
    }
}
