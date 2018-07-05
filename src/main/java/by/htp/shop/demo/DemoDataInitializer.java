package by.htp.shop.demo;

import by.htp.shop.dao.CategoryDaoImpl;
import by.htp.shop.dao.OrderDao;
import by.htp.shop.dao.ProductDaoImpl;
import by.htp.shop.dao.UserDaoImpl;
import by.htp.shop.domain.*;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class DemoDataInitializer implements InitializingBean {

    @Autowired
    private ProductDaoImpl productDao;

    @Autowired
    private CategoryDaoImpl categoryDao;

    @Autowired
    private UserDaoImpl userDao;

    @Autowired
    private OrderDao orderDao;

    @Override
    public void afterPropertiesSet() throws Exception {

        User user = new User();
        user.setName("Ivan Petrov");
        user.setPassword("user");
        user.setIsAdmin(false);

        userDao.create(user);

        Category phone = new Category();
        phone.setName("Phones");

        categoryDao.create(phone);

        Category tablet = new Category();
        tablet.setName("Tablets");

        categoryDao.create(tablet);

        Category laptop = new Category();
        laptop.setName("Laptops");

        categoryDao.create(laptop);

        Product asus = new Product();
        asus.setName("Asus");
        asus.setCategory(laptop);
        asus.setDescription("");
        asus.setInStock(true);
        asus.setQuantity(6);
        asus.setPrice(620);
        asus.setPicture("https://image.ibb.co/dEvXZy/Asus.jpg");

        productDao.create(asus);

        Product asusZenPad = new Product();
        asusZenPad.setName("Asus ZenPad");
        asusZenPad.setCategory(laptop);
        asusZenPad.setDescription("ultrathin laptop");
        asusZenPad.setInStock(true);
        asusZenPad.setQuantity(8);
        asusZenPad.setPrice(1300);
        asusZenPad.setPicture("https://image.ibb.co/cSURuy/asus1.jpg");

        productDao.create(asusZenPad);

        Product acer = new Product();
        acer.setName("Acer");
        acer.setCategory(laptop);
        acer.setDescription("chep laptop");
        acer.setInStock(true);
        acer.setQuantity(10);
        acer.setPrice(500);
        acer.setPicture("https://image.ibb.co/hn0ruy/acer.jpg");

        productDao.create(acer);

        Product dell = new Product();
        dell.setName("Dell");
        dell.setCategory(laptop);
        dell.setDescription("chight-perfomance laptop");
        dell.setInStock(true);
        dell.setQuantity(7);
        dell.setPrice(1000);
        dell.setPicture("https://image.ibb.co/hTXzgd/dell.jpg");

        productDao.create(dell);

        Product lenovoTab = new Product();
        lenovoTab.setName("Lenovo Tab");
        lenovoTab.setCategory(tablet);
        lenovoTab.setDescription("A good tablet");
        lenovoTab.setInStock(true);
        lenovoTab.setQuantity(3);
        lenovoTab.setPrice(325);
        lenovoTab.setPicture("https://image.ibb.co/gYtSZy/lenovo_Tab.jpg");

        productDao.create(lenovoTab);

        Product lenovo = new Product();
        lenovo.setName("Lenovo 10");
        lenovo.setCategory(tablet);
        lenovo.setDescription("The best tablet in its price category");
        lenovo.setInStock(true);
        lenovo.setQuantity(5);
        lenovo.setPrice(410);
        lenovo.setPicture("https://image.ibb.co/gwQ21d/lonovo.jpg");

        productDao.create(lenovo);



        Product iPhone = new Product();
        iPhone.setName("iPhone X");
        iPhone.setDescription("Smartphone with good camera");
        iPhone.setCategory(phone);
        iPhone.setPrice(900);
        iPhone.setQuantity(1);
        iPhone.setInStock(true);
        iPhone.setPicture("https://image.ibb.co/jtZbKo/iPhone.jpg");

        productDao.create(iPhone);

        Product samsung = new Product();
        samsung.setName("Samsung");
        samsung.setDescription("Sartphone");
        samsung.setCategory(phone);
        samsung.setPrice(750);
        samsung.setQuantity(1);
        samsung.setInStock(true);
        samsung.setPicture("https://image.ibb.co/mw2kC8/samsung.jpg");

        productDao.create(samsung);

        Product xiaomi = new Product();
        xiaomi.setName("Xiaomi");
        xiaomi.setDescription("Sartphone");
        xiaomi.setCategory(phone);
        xiaomi.setPrice(500);
        xiaomi.setQuantity(1);
        xiaomi.setInStock(true);
        xiaomi.setPicture("https://image.ibb.co/eFmLC8/xiaomi.jpg");

        productDao.create(xiaomi);

        //Create order for user(client)

        OrderItem orderItem = new OrderItem();
        orderItem.setProduct(xiaomi);
        orderItem.setQuantity(1);
        orderItem.setPrice(xiaomi.getPrice());

        OrderItem orderItem2 = new OrderItem();
        orderItem2.setProduct(iPhone);
        orderItem2.setQuantity(1);
        orderItem2.setPrice(iPhone.getPrice());

        List<OrderItem> orderItems = new ArrayList<>();
        orderItems.add(orderItem);
        orderItems.add(orderItem2);

        Order order = new Order();
        order.setClient(user);
        order.setDataOrder(new Date());
        order.setStatus(Status.NEW);
        order.setPrice(1400);
        order.setOrderItem(orderItems);

        orderDao.create(order);
    }
}
