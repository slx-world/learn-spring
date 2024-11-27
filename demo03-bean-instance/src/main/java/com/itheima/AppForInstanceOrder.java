package com.itheima;

import com.itheima.dao.OrderDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Song Laixiong
 * @Create: 2024-11-27
 * @Description:
 */

public class AppForInstanceOrder {

    public static void main(String[] args) {
        // 通过静态工厂创建对象
        // OrderDao orderDao = OrderDaoFactory.getOrderDao();
        // orderDao.save();

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        OrderDao orderDao = (OrderDao) ctx.getBean("orderDao");
        orderDao.save();
    }
}
