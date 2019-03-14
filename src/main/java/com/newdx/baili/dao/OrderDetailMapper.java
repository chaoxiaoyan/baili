package com.newdx.baili.dao;

import com.newdx.baili.entity.OrderDetail;
import com.newdx.baili.vo.VOrderDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderDetail record);

    int insertSelective(OrderDetail record);

    OrderDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderDetail record);

    int updateByPrimaryKey(OrderDetail record);

    List<VOrderDetail> finbByUid(@Param("id") Integer id);
}