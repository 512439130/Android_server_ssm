package io.renren.controller;

import io.renren.entity.User;
import io.renren.service.UserService;
import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

/**
 * Created by jack on 2017/3/28.
 */
@Controller
@RequestMapping("user")
public class UserController {
        @Autowired
        private UserService userService;

        /**
         * 用户注册
         * 
         * @param user
         * @return
         */
        @RequestMapping("/yy_register")
        @ResponseBody
        public String register(@RequestBody User user) {

                if (user != null) {
                        userService.registerService(user);
                        System.out.println(user.toString());
                        return "注册成功";
                } else {
                        return "注册失败";
                }
        }

        /**
         * 提交登录（后期改json登录）
         */
        @RequestMapping("/yy_login")
        @ResponseBody
        public User login(String userPhone, String userPassword) {
                Map map = new HashMap();
              map.put("userPhone", userPhone);
              map.put("userPassword", userPassword);
              
                User user = userService.getUserToken(map);
                if (user != null) {
                        System.out.println("用户信息" + user.toString());
                        System.out.println("用户登录成功：" + "账号：" + userPhone + "\n"
                                        + "密码：" + userPassword);
                        return user;
                } else {
                        System.out.println("用户登录失败：" + "账号：" + userPhone + "\n"
                                        + "密码：" + userPassword);
                        return user;
                }
        }
}
