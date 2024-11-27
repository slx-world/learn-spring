package com.itheima.factory;

import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl;

/**
 * @Author: Song Laixiong
 * @Create: 2024-11-27
 * @Description:
 */

public class UserDaoFactory {

    public UserDao getUserDao() {
        return new UserDaoImpl();
    }
}
