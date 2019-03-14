package com.newdx.baili.controller;

import com.newdx.baili.common.JsonBean;
import com.newdx.baili.entity.Cart;
import com.newdx.baili.entity.User;
import com.newdx.baili.service.CartService;
import com.newdx.baili.utils.JsonUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Api(value = "购物车",tags = "购物车相关操作")
@RestController
@CrossOrigin
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @ApiOperation(value = "添加到购物车",notes = "添加到购物车")
    @RequestMapping("/add.do")
    public JsonBean addGoodsToCart(@ApiParam(name = "gid",value = "商品ID")Integer gid, @ApiParam(name = "num",value = "数量")Integer num, @ApiParam(name = "u",value = "用户ID")Integer uid, @ApiParam(name = "pid",value = "图片ID")Integer pid, @ApiParam(name = "size",value = "尺码")String size) {

        Cart cart = new Cart();
        cart.setGid(gid);
        cart.setNum(num);
        cart.setUid(uid);
        cart.setPid(pid);
        cart.setSize(size);

        return cartService.addGoodsToCart(cart);
    }

    @ApiOperation(value = "根据uid查询购物车信息",notes = "根据uid查询购物车信息")
    @RequestMapping("/findByUid.do")
    public JsonBean findCartByUid(Integer uid) {
        if (uid == null || uid.equals("")) {
            return JsonUtils.createJsonBean(0,"未登录，请先登录");
        }
        return cartService.findByUid(uid);
    }

    @ApiOperation(value = "根据uid删除购物车信息",notes = "根据uid删除购物车信息")
    @RequestMapping("/deleteById.do")
    public JsonBean deleteCartById(Integer uid, Integer id) {
        if (uid == null || uid.equals("")) {
            return JsonUtils.createJsonBean(0,"未登录，请先登录");
        }
        return cartService.deleteById(id);
    }

}
