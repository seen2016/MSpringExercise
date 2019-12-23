package com.seen.myspring.factory;

import com.seen.myspring.util.UserInfo;

/**
 * Created by Administrator on 2019/12/23.
 */
public class CustomFactory {
    public UserInfo getUserinfo(String name,String age){
        return new UserInfo(name,age);
    }
}
