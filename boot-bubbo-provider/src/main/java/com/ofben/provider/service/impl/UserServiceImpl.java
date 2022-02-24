package com.ofben.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ofben.api.bean.UserAddress;
import com.ofben.api.service.UserService;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service(version = "1.0.0")
@Component
public class UserServiceImpl implements UserService {

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("userId：" + userId);
        List<String> addresses = Arrays.asList("BEIJING", "SHANGHAI", "TIANJIN");
        System.out.println("version = 1.0.0");
        List<UserAddress> userAddresses = addresses.stream().map(address -> UserAddress.builder().address(address).build()).collect(Collectors.toList());
        return userAddresses;
    }
}
