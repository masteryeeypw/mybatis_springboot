package com.demo.dao;

import com.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @describe
 * @Date 2023/3/17 10:49
 */
@Mapper
public interface UserMapper {

    @Select("select * from user limit 1")
    User getOne();

}
