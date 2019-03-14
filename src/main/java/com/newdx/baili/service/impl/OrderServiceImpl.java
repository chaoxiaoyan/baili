package com.newdx.baili.service.impl;

import com.newdx.baili.common.JsonBean;
import com.newdx.baili.dao.OrderDetailMapper;
import com.newdx.baili.dao.OrderMapper;
import com.newdx.baili.entity.Order;
import com.newdx.baili.entity.OrderDetail;
import com.newdx.baili.service.OrderService;
import com.newdx.baili.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private OrderDetailMapper orderDetailMapper;

    @Override
    @Transactional
    public JsonBean addOrder(Order order, OrderDetail orderDetail) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
            String uuid = UUID.randomUUID().toString().replace("-", "");
           order.setOrderno("BL"+ uuid + (sdf.format(new Date())));
           order.setCreatetime(sdf.parse(sdf.format(new Date())));

           orderMapper.insertSelective(order);
            int id = order.getId();
            orderDetail.setOid(id);
            orderDetailMapper.insertSelective(orderDetail);

            return JsonUtils.createJsonBean(1,null);
        } catch (Exception e) {
            e.printStackTrace();
            return JsonUtils.createJsonBean(0,e.getMessage());
        }
    }

    @Override
    @Transactional
    public JsonBean deleteOrderById(Integer id) {
        try {
            orderDetailMapper.deleteByPrimaryKey(id);
            orderMapper.deleteByPrimaryKey(id);
            return JsonUtils.createJsonBean(1,null);
        } catch (Exception e) {
            e.printStackTrace();
            return JsonUtils.createJsonBean(0,e.getMessage());
        }

    }
}
