package com.newdx.baili.controller;

import com.newdx.baili.common.ComBean;
import com.newdx.baili.common.JsonBean;
import com.newdx.baili.entity.User;
import com.newdx.baili.service.UserService;
import com.newdx.baili.utils.JsonUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
@Api(value = "用户",tags = "用户相关操作")
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @ApiOperation(value = "登录",notes = "实现用户的登录，记得自己验空")
    @RequestMapping("/login.do")
    public JsonBean login(@RequestBody User user, HttpSession session) {
        // String token = "";
        if (userService.login(user).getCode() == 1) {
            ComBean.map.put("uid",user.getId());

            session.setAttribute("user", user);

        }

        return userService.login(user);
    }

    @ApiOperation(value = "注册",notes = "实现用户的注册，记得自己验空")
    @RequestMapping("/register.do")
    public JsonBean register(@ApiParam(name = "username",value = "用户名") String username,@ApiParam(name = "password",value = "密码") String password, @ApiParam(name = "repassword",value = "确认密码") String repassword,@ApiParam(name = "phone",value = "手机号") String phone,@ApiParam(name = "gender",value = "性别") String gender){

        User user = new User();

        if (password != null || !password.equals("") || !password.equals(repassword)) {
            return JsonUtils.createJsonBean(0,"两次密码输入不一致");
        }

        user.setUsername(username);
        user.setPassword(password);
        user.setPhone(phone);
        user.setGender(gender);

        return userService.register(user);
    }
}
