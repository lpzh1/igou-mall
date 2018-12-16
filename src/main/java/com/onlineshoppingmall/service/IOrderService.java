package com.onlineshoppingmall.service;

import com.onlineshoppingmall.common.ServerResponse;

public interface IOrderService {

    ServerResponse pay(Long orderNo, Integer userId, String path);
}
