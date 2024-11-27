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

    public BookDaoImpl() {
        System.out.println("book dao constructor is running ...");
    }

    // private BookDaoImpl() {
    //     System.out.println("book dao constructor is running ...");
    // }

    // public BookDaoImpl(int i) {
    //     System.out.println("book dao constructor is running ...");
    // }
}
