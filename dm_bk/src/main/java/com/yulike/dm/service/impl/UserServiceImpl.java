package com.yulike.dm.service.impl;

import com.yulike.dm.dao.UserDao;
import com.yulike.dm.pojo.User;
import com.yulike.dm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    public User getUserById(Long id) {
        User user = null;
        try {
            user = userDao.getUserById(id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return user;
    }
}
