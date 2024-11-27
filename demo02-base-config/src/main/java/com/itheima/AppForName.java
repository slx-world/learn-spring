package com.itheima;

import com.itheima.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Song Laixiong
 * @Create: 2024-11-27
 * @Description:
 */

public class AppForName {

    public static void main(String[] args) {
        // 获取 IOC 容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        // System.out.println(ctx);

        // BookDao dao = (BookDao) ctx.getBean("dao");
        // dao.save();

        BookService bookServiceImpl = (BookService) ctx.getBean("bookServiceImpl");
        bookServiceImpl.save();
    }
}
