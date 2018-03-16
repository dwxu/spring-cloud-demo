package cn.dwxu.admin.service.impl;

import cn.dwxu.admin.mapper.UserMapper;
import cn.dwxu.admin.service.IUserService;
import cn.dwxu.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> list() {
        return null;
    }

    @Override
    public User get(long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean add(User user) {
        return false;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }
}
