package com.newdx.baili.service;

import com.newdx.baili.common.JsonBean;
import com.newdx.baili.entity.Cart;

public interface CartService {

    public JsonBean addGoodsToCart(Cart cart);

    // 根据uid查找购物车信息
    public JsonBean findByUid(int uid);

    public JsonBean deleteById(int id);
}
