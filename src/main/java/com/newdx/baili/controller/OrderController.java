package com.newdx.baili.controller;

import com.newdx.baili.common.JsonBean;
import com.newdx.baili.entity.Order;
import com.newdx.baili.entity.OrderDetail;
import com.newdx.baili.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/order")
public class OrderController {


    @Autowired
    private OrderService orderService;

    @RequestMapping("/add.do")
    public JsonBean addOrder(Order order,OrderDetail orderDetail){
        return orderService.addOrder(order,orderDetail);
    }

    @RequestMapping("/deleteOrder.do")
    public JsonBean deleteOrder(Integer id) {
        return orderService.deleteOrderById(id);
    }
}
