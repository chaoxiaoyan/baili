package com.newdx.baili.service.impl;

import com.newdx.baili.common.JsonBean;
import com.newdx.baili.dao.GoodsMapper;
import com.newdx.baili.service.GoodsService;
import com.newdx.baili.utils.JsonUtils;
import com.newdx.baili.vo.VGoods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;


    @Override
    public JsonBean findByDesign(String design) {
        try {

            return JsonUtils.createJsonBean(1,goodsMapper.findByDesign(design));
        } catch (Exception e) {
            e.printStackTrace();
            return JsonUtils.createJsonBean(0,e.getMessage());
        }
    }

    @Override
    public JsonBean findByBrand(String brand) {
        try {

            return JsonUtils.createJsonBean(1,goodsMapper.findByBrand(brand));
        } catch (Exception e) {
            e.printStackTrace();
            return JsonUtils.createJsonBean(0,e.getMessage());
        }
    }

    @Override
    public JsonBean findByName(String name) {
        try {

            return JsonUtils.createJsonBean(1,goodsMapper.findByName(name));
        } catch (Exception e) {
            e.printStackTrace();
            return JsonUtils.createJsonBean(0,e.getMessage());
        }
    }

    @Override
    public JsonBean findByGender(String gender) {
        try {

            return JsonUtils.createJsonBean(1,goodsMapper.findByGender(gender));
        } catch (Exception e) {
            e.printStackTrace();
            return JsonUtils.createJsonBean(0,e.getMessage());
        }
    }

    @Override
    public JsonBean findByColor(String color) {
        try {

            return JsonUtils.createJsonBean(1,goodsMapper.findByColor(color));
        } catch (Exception e) {
            e.printStackTrace();
            return JsonUtils.createJsonBean(0,e.getMessage());
        }
    }

    @Override
    public JsonBean findByStyle(String style) {
        try {

            return JsonUtils.createJsonBean(1,goodsMapper.findByStyle(style));
        } catch (Exception e) {
            e.printStackTrace();
            return JsonUtils.createJsonBean(0,e.getMessage());
        }
    }

    @Override
    public JsonBean findBySeason(String season) {
        try {

            return JsonUtils.createJsonBean(1,goodsMapper.findBySeason(season));
        } catch (Exception e) {
            e.printStackTrace();
            return JsonUtils.createJsonBean(0,e.getMessage());
        }
    }

    @Override
    public JsonBean findById(Integer id) {
        try {
            return JsonUtils.createJsonBean(1,goodsMapper.findGoodsById(id));
        } catch (Exception e) {
            e.printStackTrace();
            return JsonUtils.createJsonBean(0,e.getMessage());
        }
    }

    @Override
    public JsonBean findXinkuan() {
        try {

            return JsonUtils.createJsonBean(1,goodsMapper.findXinkuan());
        } catch (Exception e) {
            e.printStackTrace();
            return JsonUtils.createJsonBean(0,e.getMessage());
        }
    }
}
