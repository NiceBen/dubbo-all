package com.ofben.api.stub;

import com.ofben.api.bean.UserAddress;
import com.ofben.api.service.UserService;

import java.util.List;

public class UserServiceStub implements UserService {
    private final UserService userService;

    public UserServiceStub(UserService userService) {
        this.userService = userService;
    }

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        // ... 此代码在客户端执行，可以在客户端做 ThreadLocal 本地缓存，或预先验证参数是否合法，等等
        if ("false".equals(userId)) {
            System.out.println("false:" + "拦截不调用后续方法");
            return null;
        }
        try {
            return userService.getUserAddressList(userId);
        } catch (Exception e) {
            // 容错，或者AOP拦截
        }
        // 返回容错数据
        return null;
    }
}
