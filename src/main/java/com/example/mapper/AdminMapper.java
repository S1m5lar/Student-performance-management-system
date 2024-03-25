package com.example.mapper;

import com.example.enetity.Admin;
import org.apache.ibatis.annotations.Select;

public interface AdminMapper {

    @Select("select * from admin where username = #{username}")
    Admin selectByUsername(String username);

}
