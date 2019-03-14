package com.newdx.baili.service.impl;

import com.newdx.baili.common.JsonBean;
import com.newdx.baili.dao.CommonMapper;
import com.newdx.baili.service.CommenService;
import com.newdx.baili.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommenServiceImpl implements CommenService {

    @Autowired
    private CommonMapper commonMapper;


    @Override
    public JsonBean findByGid(Integer id) {
        try {
            return JsonUtils.createJsonBean(1,commonMapper.findByGid(id));
        } catch (Exception e) {
            e.printStackTrace();
            return JsonUtils.createJsonBean(0,e.getMessage());
        }
    }
}
