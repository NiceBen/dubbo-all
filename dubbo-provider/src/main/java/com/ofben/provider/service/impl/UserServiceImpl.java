package com.ofben.provider.service.impl;

import com.ofben.api.bean.UserAddress;
import com.ofben.api.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("userId：" + userId);
        List<String> addresses = Arrays.asList("BEIJING", "SHANGHAI", "TIANJIN");
        List<UserAddress> userAddresses = addresses.stream().map(address -> UserAddress.builder().address(address).build()).collect(Collectors.toList());
        return userAddresses;
    }
}
