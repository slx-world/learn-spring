package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.service.BookService;

/**
 * @Author: Song Laixiong
 * @Create: 2024-11-27
 * @Description:
 */

public class BookServiceImpl implements BookService {

    // 删除业务层中使用 new 的方式创建 dao 对象
    // private BookDao bookDao =new BookDaoImpl();

    private BookDao bookDao;

    @Override
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }

    // 提供对应的 set 方法
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
