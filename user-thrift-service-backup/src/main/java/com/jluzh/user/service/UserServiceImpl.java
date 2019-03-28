package com.jluzh.user.service;

import com.jluzh.thrift.user.UserInfo;
import com.jluzh.thrift.user.UserService;
import org.apache.thrift.TException;

@Service
public class UserServiceImpl implements UserService.Iface{

    @Override
    public UserInfo getUserById(int id) throws TException {
        return null;
    }

    @Override
    public UserInfo getTeacherById(int id) throws TException {
        return null;
    }

    @Override
    public UserInfo getUserByName(String username) throws TException {
        return null;
    }

    @Override
    public void regiserUser(UserInfo userInfo) throws TException {

    }
}
