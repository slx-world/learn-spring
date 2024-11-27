package com.itheima.dao.impl;


import com.itheima.dao.BookDao;

/**
 * @Author: Song Laixiong
 * @Create: 2024-11-27
 * @Description:
 */

public class BookDaoImpl implements BookDao {

    @Override
    public void save() {
        System.out.println("book dao save ...");
    }

    // 表示 bean 初始化对应的操作
    public void init() {
        System.out.println("init ...");
    }

    // 表示 bean 销毁对应的操作
    public void destory() {
        System.out.println("destory ...");
    }
}
