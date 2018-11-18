package com.onlineshoppingmall.service;

import com.onlineshoppingmall.common.ServerResponse;
import com.onlineshoppingmall.pojo.User;

public interface IUserService {

    ServerResponse<User> login(String username, String password);

    ServerResponse<String> register(User user);

    public ServerResponse<String> checkValid(String str, String type);
}
