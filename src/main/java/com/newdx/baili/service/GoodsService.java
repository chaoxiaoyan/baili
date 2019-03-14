package com.newdx.baili.service;

import com.newdx.baili.common.JsonBean;
import com.newdx.baili.vo.VGoods;

import java.util.List;

public interface GoodsService {

    public JsonBean findByDesign(String design);


    public JsonBean findByBrand(String brand);


    public JsonBean findByName(String name);


    public JsonBean findByGender(String gender);


    public JsonBean findByColor(String color);


    public JsonBean findByStyle(String style);


    public JsonBean findBySeason(String season);

    public JsonBean findById(Integer id);


    public JsonBean findXinkuan();
}
