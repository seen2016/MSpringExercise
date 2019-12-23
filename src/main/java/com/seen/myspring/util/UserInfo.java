package com.seen.myspring.util;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2019/12/13.
 */
public class UserInfo {

    private String name;
    private String age;
    private String address;


    public UserInfo() {
    }

    public UserInfo(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
