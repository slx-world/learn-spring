package com.itheima;

import com.itheima.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Song Laixiong
 * @Create: 2024-11-27
 * @Description:
 */

public class AppForInstanceUser {

    public static void main(String[] args) {
        // 创建实例工厂对象
        // UserDaoFactory userDaoFactory = new UserDaoFactory();
        // // 通过实例工厂对象创建对象
        // UserDao userDao = userDaoFactory.getUserDao();
        // userDao.save();

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        // UserDao userDao = (UserDao) ctx.getBean("userDao");
        // userDao.save();
        UserDao userDao1 = (UserDao) ctx.getBean("userDao");
        UserDao userDao2 = (UserDao) ctx.getBean("userDao");
        System.out.println(userDao1.equals(userDao2));
        System.out.println(userDao1);
        System.out.println(userDao2);
    }
}
