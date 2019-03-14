package com.newdx.baili.controller;

import com.newdx.baili.common.JsonBean;
import com.newdx.baili.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/orderdetail")
public class OrderDetailController {


    @Autowired
    private OrderDetailService orderDetailService;
    @RequestMapping("/list.do")
    public JsonBean findByUid(Integer id) {
        return orderDetailService.findByUid(id);
    }
}
