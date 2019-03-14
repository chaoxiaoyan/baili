package com.newdx.baili.service;

import com.newdx.baili.common.JsonBean;
import com.newdx.baili.entity.Order;
import com.newdx.baili.entity.OrderDetail;

public interface OrderService {

    public JsonBean addOrder(Order order,OrderDetail orderDetail);

    public JsonBean deleteOrderById(Integer id);


}
