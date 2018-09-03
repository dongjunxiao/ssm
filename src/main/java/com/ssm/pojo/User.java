package com.ssm.pojo;

import com.alibaba.fastjson.JSON;

/**
 * Created on 2018/3/14 15:42.
 *
 * @author xdj
 */
public class User {

    private Long id;

    private String name;

    private Integer age;

    private String sex;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
