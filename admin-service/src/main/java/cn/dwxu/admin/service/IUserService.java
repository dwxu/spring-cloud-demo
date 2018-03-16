package cn.dwxu.admin.service;

import cn.dwxu.bean.User;

import java.util.List;

public interface IUserService {
    List<User> list();

    User get(long id);

    boolean add(User user);

    boolean delete(long id);
}
