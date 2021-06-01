package com.ming.mybatisplusdemo1.controller;

import com.ming.mybatisplusdemo1.entity.Users;
import com.ming.mybatisplusdemo1.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName UsersController
 * @Deacription TODO
 * @Author cgm
 * @Date 2021/4/22 21:10
 * @Version 1.0
 **/
@RestController
@RequestMapping("/user")
public class UsersController {

    @Autowired
    private UsersMapper usersMapper;

    /**
     * 获取用户列表
     * @return
     */
    @GetMapping("/get")
    public List<Users> getUsers(){
        List<Users> users = usersMapper.selectList(null);
        return users;
    }

}
