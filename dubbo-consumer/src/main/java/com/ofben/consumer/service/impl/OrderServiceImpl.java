package com.ofben.consumer.service.impl;

import com.ofben.api.bean.UserAddress;
import com.ofben.api.service.OrderService;
import com.ofben.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    UserService userService;

    @Override
    public void initOrder(String userId) {
        // 1.查询用户的收件地址
        List<UserAddress> addressList = userService.getUserAddressList(userId);
        System.out.println(addressList);
    }
}
