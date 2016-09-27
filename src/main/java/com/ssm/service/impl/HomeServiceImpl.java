package com.ssm.service.impl;

import com.ssm.service.HomeService;
import org.springframework.stereotype.Service;

@Service
public class HomeServiceImpl implements HomeService {

    @Override
    public int getStringLength(String str) {
        System.out.println(str);
        return str == null ? 0 : str.length();
    }
}
