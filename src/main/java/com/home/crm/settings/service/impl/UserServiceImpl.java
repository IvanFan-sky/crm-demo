package com.home.crm.settings.service.impl;

import com.home.crm.settings.dao.UserDao;
import com.home.crm.settings.service.UserServive;
import com.home.crm.utils.SqlSessionUtil;

public class UserServiceImpl implements UserServive {
    private UserDao userDao= SqlSessionUtil.getSqlSession().getMapper(UserDao.class);
}
