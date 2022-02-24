package com.ofben.consumer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ofben.api.bean.UserAddress;
import com.ofben.api.service.OrderService;
import com.ofben.api.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    // 全局超时，默认为 1000
    @Reference( version = "*", stub = "com.ofben.api.stub.UserServiceStub", url = "127.0.0.1:20890")
    UserService userService;

    @Override
    public void initOrder(String userId) {
        // 1.查询用户的收件地址
        List<UserAddress> addressList = userService.getUserAddressList(userId);
        System.out.println(addressList);
    }
}
