package com.newdx.baili.service.impl;

import com.newdx.baili.common.JsonBean;
import com.newdx.baili.dao.CartMapper;
import com.newdx.baili.entity.Cart;
import com.newdx.baili.service.CartService;
import com.newdx.baili.utils.JsonUtils;
import com.newdx.baili.vo.VCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    private CartMapper cartMapper;

    @Override
    public JsonBean addGoodsToCart(Cart cart) {
        try {
            cartMapper.insert(cart);
            return JsonUtils.createJsonBean(1,null);
        } catch (Exception e) {
            e.printStackTrace();
            return JsonUtils.createJsonBean(1,e.getMessage());

        }
    }

    @Override
    public JsonBean findByUid(int uid) {
        try {
            List<VCart> list = cartMapper.selectByUid(uid);
            return JsonUtils.createJsonBean(1,list);
        } catch (Exception e) {
            e.printStackTrace();
            return JsonUtils.createJsonBean(0,e.getMessage());
        }
    }

    @Override
    public JsonBean deleteById(int id) {
        try {
            cartMapper.deleteByPrimaryKey(id);
            return JsonUtils.createJsonBean(1,null);
        } catch (Exception e) {
            e.printStackTrace();
            return JsonUtils.createJsonBean(0,e.getMessage());
        }
    }
}
