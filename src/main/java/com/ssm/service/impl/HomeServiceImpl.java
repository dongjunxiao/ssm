package com.ssm.service.impl;

import com.alibaba.fastjson.JSON;
import com.ssm.dao.UserMapper;
import com.ssm.pojo.User;
import com.ssm.service.HomeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author xdj
 */
@Service
public class HomeServiceImpl implements HomeService {

    private Logger logger = LoggerFactory.getLogger(HomeServiceImpl.class);

    @Resource
    private UserMapper userMapper;

    @Override
    public int getStringLength(String str) {
        User user = userMapper.selectById(1);
        logger.info(user.toString());
        System.out.println(str);
        return str == null ? 0 : str.length();
    }
}
