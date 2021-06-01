package com.ming.mybatisplusdemo1;

import com.ming.mybatisplusdemo1.entity.Users;
import com.ming.mybatisplusdemo1.mapper.UsersMapper;
import jdk.internal.org.objectweb.asm.commons.SerialVersionUIDAdder;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.Serializable;
import java.util.List;

@SpringBootTest
class Tests {

    @Autowired
    private UsersMapper usersMapper;

    @Test
    void contextLoads() {
    }

    @Test
    public void getUsers(){
        //List<Users> users = usersMapper.selectList(null);

        //System.out.println(users);
    }

}
