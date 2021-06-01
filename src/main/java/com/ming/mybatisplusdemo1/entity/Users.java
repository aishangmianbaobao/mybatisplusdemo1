package com.ming.mybatisplusdemo1.entity;

import lombok.Data;

/**
 * @ClassName Users
 * @Deacription TODO
 * @Author cgm
 * @Date 2021/4/22 21:11
 * @Version 1.0
 **/
@Data
public class Users {

    //用户id
    private Integer id;
    //用户名称
    private String userName;
    //用户密码
    private String userPassword;
    //逻辑删除（0未删除 1已删除）
    private String del;

}
