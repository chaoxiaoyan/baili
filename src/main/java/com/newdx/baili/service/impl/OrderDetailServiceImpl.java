package com.newdx.baili.service.impl;

import com.newdx.baili.common.JsonBean;
import com.newdx.baili.dao.OrderDetailMapper;
import com.newdx.baili.service.OrderDetailService;
import com.newdx.baili.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl implements OrderDetailService {


    @Autowired
    private OrderDetailMapper orderDetailMapper;


    @Override
    public JsonBean findByUid(Integer id) {
        return JsonUtils.createJsonBean(1,orderDetailMapper.finbByUid(id));
    }
}
