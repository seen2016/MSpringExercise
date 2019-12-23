package com.seen.myspring.services;

import com.seen.myspring.util.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2019/12/23.
 */
@Component
public class UserInfoService {
    @Autowired //注意这里的名字要与spring.xml里所注入的id要一致，不然会找不到
    private UserInfo userInfo2;


    public UserInfo getUserInfo3() {
        return userInfo2;
    }

    public void setUserInfo3(UserInfo userInfo3) {
        this.userInfo2 = userInfo3;
    }
}
