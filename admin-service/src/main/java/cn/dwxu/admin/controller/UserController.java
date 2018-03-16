package cn.dwxu.admin.controller;

import cn.dwxu.admin.service.IUserService;
import cn.dwxu.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/list")
    public List<User> index() {
        return null;
    }

    @RequestMapping("/{id}/get")
    public User get(@PathVariable Long id) {
        if (id == null || id <= 0) {
            return null;
        }
        return userService.get(id);
    }
}
