package com.newdx.baili.dao;

import com.newdx.baili.entity.Goods;
import com.newdx.baili.vo.VGoods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);

    /**
     * 通过款式查找商品（鞋子/衣服）
     * @param design
     * @return
     */
    List<VGoods> findByDesign(String design);

    /**
     * 通过品牌查找商品（belle/nik）
     * @param brand
     * @return
     */
    List<VGoods> findByBrand(String brand );
    /**
     * 通过名字查找商品（休闲鞋/跑步鞋。。。）
     * @param name
     * @return
     */
    List<VGoods> findByName(String name );
    /**
     * 通过性别查找商品（女/男）
     * @param gender
     * @return
     */
    List<VGoods> findByGender(String gender );
    /**
     * 通过颜色查找商品（）
     * @param color
     * @return
     */
    List<VGoods> findByColor(String color );
    /**
     * 通过风格查找商品（）
     * @param style
     * @return
     */
    List<VGoods> findByStyle(String style );
    /**
     * 通过季节查找商品（）
     * @param season
     * @return
     */
    List<VGoods> findBySeason(String season );
    /**
     * 2019热搜商品（）
     */
    List<VGoods> findXinkuan();

    List<VGoods> findGoodsById(Integer id);
}