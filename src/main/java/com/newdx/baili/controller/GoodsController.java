package com.newdx.baili.controller;

import com.newdx.baili.common.JsonBean;
import com.newdx.baili.service.GoodsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Api(value = "商品",tags = "商品相关操作")
@RestController
@CrossOrigin
@RequestMapping("/goods")
public class GoodsController {



    @Autowired
    private GoodsService goodsService;

    @ApiOperation(value = "根据款式查询",notes = "根据款式查询")
    @RequestMapping("/findByDesign.do")
    public JsonBean findByDesign(@ApiParam(name = "design",value = "款式") String design) {
        return goodsService.findByDesign(design);
    }

    @ApiOperation(value = "根据商标查询",notes = "根据商标查询")
    @RequestMapping("/findByBrand.do")
    public JsonBean findByBrand(@ApiParam(name = "brand",value = "商标") String brand) {
        return goodsService.findByBrand(brand);
    }

    @ApiOperation(value = "根据商品名称查询",notes = "根据商品名称查询")
    @RequestMapping("/findByName.do")
    public JsonBean findByName(@ApiParam(name = "name",value = "商品名称") String name) {
        return goodsService.findByName(name);
    }

    @ApiOperation(value = "根据性别名称查询",notes = "根据性别名称查询")
    @RequestMapping("/findByGender.do")
    public JsonBean findByGender(@ApiParam(name = "gender",value = "性别") String gender) {
        return goodsService.findByDesign(gender);
    }

    @ApiOperation(value = "根据颜色名称查询",notes = "根据颜色名称查询")
    @RequestMapping("/findByColor.do")
    public JsonBean findByColor(@ApiParam(name = "color",value = "颜色") String color) {
        return goodsService.findByColor(color);
    }

    @ApiOperation(value = "根据风格名称查询",notes = "根据风格名称查询")
    @RequestMapping("/findByStyle.do")
    public JsonBean findByStyle(@ApiParam(name = "style",value = "风格") String style) {
        return goodsService.findByStyle(style);
    }

    @ApiOperation(value = "根据季节名称查询",notes = "根据季节名称查询")
    @RequestMapping("/findBySeason.do")
    public JsonBean findBySeason(@ApiParam(name = "season",value = "季节") String season) {
        return goodsService.findBySeason(season);
    }

    @ApiOperation(value = "查询所有",notes = "查询所有商品")
    @RequestMapping("/findByXinKuan.do")
    public JsonBean findxinkuan() {
        return goodsService.findXinkuan();
    }

    @ApiOperation(value = "根据ID名称查询",notes = "根据ID名称查询")
    @RequestMapping("/findById.do")
    public JsonBean findById(@ApiParam(name = "id",value = "ID") Integer id) {
        return goodsService.findById(id);
    }
}
