package com.ming.mybatisplusdemo1.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ming.mybatisplusdemo1.entity.Users;
import org.springframework.stereotype.Repository;

/**
 * @ClassName UsersMapper
 * @Deacription TODO
 * @Author cgm
 * @Date 2021/4/22 21:16
 * @Version 1.0
 **/
@Repository
public interface UsersMapper extends BaseMapper<Users> {
}
