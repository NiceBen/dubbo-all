package com.ofben.api.service;

import com.ofben.api.bean.UserAddress;

import java.util.List;

public interface UserService {

    List<UserAddress> getUserAddressList(String userId);
}
