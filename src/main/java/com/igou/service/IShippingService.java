package com.igou.service;

import com.github.pagehelper.PageInfo;
import com.igou.common.ServerResponse;
import com.igou.pojo.Shipping;

public interface IShippingService {
    ServerResponse add(Integer userId, Shipping shipping);
    ServerResponse<String> del(Integer userId, Integer shippingId);
    ServerResponse update(Integer userId, Shipping shipping);
    ServerResponse<Shipping> select(Integer userId, Integer shippingId);
    ServerResponse<PageInfo> list(Integer userId, int pageNum, int pageSize);
}
