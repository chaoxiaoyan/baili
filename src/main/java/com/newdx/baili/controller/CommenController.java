package com.newdx.baili.controller;

import com.newdx.baili.common.JsonBean;
import com.newdx.baili.service.CommenService;
import com.newdx.baili.utils.JsonUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@Api(value = "评价",tags = "该产品的历史评价")
@RequestMapping("/com")
public class CommenController {

    @Autowired
    private CommenService commenService;

    @ApiOperation(value = "产品评价",notes = "根据商品ID获取的历史评价")
    @RequestMapping("/findByGid.do")
    public JsonBean findByGid(@ApiParam(name = "id",value = "商品id") Integer id){
        return commenService.findByGid(id);
    }
}
