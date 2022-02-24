package com.ofben.api.bean;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class UserAddress implements Serializable {

    private String address;
}
