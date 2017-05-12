package io.renren.controller;

import io.renren.entity.User;
import io.renren.service.UserService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class UserController {

        @Autowired
        private UserService userService;

        @RequestMapping("/yy_register")
        @ResponseBody
        public String register(@RequestBody User user) {
                if (user != null) {
                        this.userService.registerService(user);
                        System.out.println(user.toString());
                        return "注册成功";
                }
                return "注册失败";
        }

        @RequestMapping("/yy_login")
        @ResponseBody
        public User login(String userPhone, String userPassword) {
                Map map = new HashMap();
                map.put("userPhone", userPhone);
                map.put("userPassword", userPassword);

                User user = this.userService.getUserToken(map);
                if (user != null) {
                        System.out.println("用户信息" + user.toString());
                        System.out.println("用户登录成功：账号：" + userPhone + "\n"
                                        + "密码：" + userPassword);
                        return user;
                }
                System.out.println("用户登录失败：账号：" + userPhone + "\n" + "密码："
                                + userPassword);
                return user;
        }

        @RequestMapping("/yy_update_pass")
        @ResponseBody
        public int updatepass(String userPhone, String userPassword) {
                Map map = new HashMap();
                map.put("userPhone", userPhone);
                map.put("userPassword", userPassword);

                int result = this.userService.updateUserPass(map);
                if (result == 1) {
                        System.out.println("用户修改密码成功");
                        return result;
                }
                System.out.println("用户修改密码失败");
                return result;
        }

        @RequestMapping("/yy_get_userinfo")
        @ResponseBody
        public User getUserInfo(String userPhone) {
                Map map = new HashMap();
                map.put("userPhone", userPhone);

                User user = this.userService.getUserMessage(map);
                if (user != null) {
                        System.out.println("用户信息获取成功" + user.toString());
                        return user;
                }
                System.out.println("用户信息获取失败");
                return user;
        }

        @RequestMapping("/yy_get_alluserinfo")
        @ResponseBody
        public List<User> getAllUserInfo() {
                List user = this.userService.getAllUserMessage();
                if (user != null) {
                        System.out.println("全部用户信息获取成功");
                        return user;
                }
                System.out.println("全部用户信息获取失败");
                return user;
        }

        @RequestMapping("/yy_update_userImage")
        @ResponseBody
        public int updateUserImage(String userPhone, String userImage) {
                Map map = new HashMap();
                map.put("userPhone", userPhone);
                map.put("userImage", userImage);

                int result = this.userService.updateUserImage(map);
                if (result == 1) {
                        System.out.println("用户头像更换成功");
                        return result;
                }
                System.out.println("用户头像更换失败");
                return result;
        }

        @RequestMapping("/yy_update_userInfo")
        @ResponseBody
        public int UpdateUserInfo(@RequestBody User user) {
                if (user != null) {
                        int result = this.userService.updateUserInfo(user);
                        if (result == 1) {
                                System.out.println("完善用户信息请求处理成功");
                                return result;
                        }
                        System.out.println("完善用户信息请求处理失败");
                        return result;
                }

                return 3;
        }
}