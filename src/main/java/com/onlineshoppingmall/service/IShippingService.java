package com.onlineshoppingmall.service;

import com.onlineshoppingmall.common.ServerResponse;
import com.onlineshoppingmall.pojo.Shipping;

public interface IShippingService {
    ServerResponse add(Integer userId, Shipping shipping);
    ServerResponse<String> del(Integer userId, Integer shippingId);
    ServerResponse update(Integer userId, Shipping shipping);
}
