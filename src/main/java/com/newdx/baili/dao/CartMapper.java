package com.newdx.baili.dao;

import com.newdx.baili.entity.Cart;
import com.newdx.baili.vo.VCart;

import java.util.List;

public interface CartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cart record);

    Cart selectByPrimaryKey(Integer id);

    List<VCart> selectByUid(Integer uid);

}