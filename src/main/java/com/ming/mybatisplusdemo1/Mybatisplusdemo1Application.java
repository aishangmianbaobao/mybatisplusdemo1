package com.ming.mybatisplusdemo1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ming.mybatisplusdemo1.mapper")
public class Mybatisplusdemo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Mybatisplusdemo1Application.class, args);
    }

}
