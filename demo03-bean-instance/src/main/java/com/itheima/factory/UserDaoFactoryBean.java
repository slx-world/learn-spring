package com.itheima.factory;

import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;

/**
 * @Author: Song Laixiong
 * @Create: 2024-11-27
 * @Description:
 */

public class UserDaoFactoryBean implements FactoryBean<UserDao> {

    // 代替原始实例工厂中创建对象的方法
    @Override
    public UserDao getObject() throws Exception {
        return new UserDaoImpl();
    }

    // 返回所创建类的 class 对象
    @Override
    public Class<?> getObjectType() {
        return UserDao.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
