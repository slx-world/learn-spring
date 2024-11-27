package com.itheima.factory;

import com.itheima.dao.OrderDao;
import com.itheima.dao.impl.OrderDaoImpl;

/**
 * @Author: Song Laixiong
 * @Create: 2024-11-27
 * @Description:
 */

// 静态工工厂创建对象
public class OrderDaoFactory {

    public static OrderDao getOrderDao() {
        System.out.println("静态工厂创建对象...");
        return new OrderDaoImpl();
    }
}
