package com.ssm.dao;

import com.ssm.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created on 2018/9/3 14:31.
 *
 * @author xdj
 */
public interface UserMapper {

    User selectById(@Param("id") long id);

}
