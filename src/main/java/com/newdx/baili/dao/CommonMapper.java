package com.newdx.baili.dao;

import com.newdx.baili.entity.Common;
import com.newdx.baili.vo.Vcommen;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommonMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Common record);

    int insertSelective(Common record);

    Common selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Common record);

    int updateByPrimaryKey(Common record);


    List<Vcommen> findByGid(@Param("id") Integer id);



}