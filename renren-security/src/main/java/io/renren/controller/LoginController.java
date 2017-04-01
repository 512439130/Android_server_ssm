package io.renren.controller;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.PrintWriter;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import io.renren.entity.User;
import io.renren.service.UserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.Producer;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
        @Autowired
        private UserService userService;

        /**
         * 提交登录
         */
        @RequestMapping("/yy_login")
        @ResponseBody
        public String login(String username, String password, HttpSession session)throws IOException {
                User user = userService.queryByUserName(username);
                //PrintWriter writer = response.getWriter();
                if (user == null || !user.getPassword().equals(password)){
                        System.out.println("用户登录失败："+"账号："+username + "\n"+"密码：" + password);
                        //writer.write("login error!");
                        return "登录失败";
                }else{
                        //writer.write("login success!");
                        session.setAttribute("user",user);
                        System.out.println("用户登录成功："+"账号："+username + "\n"+"密码：" + password);
                        return "登录成功";
                }       
                //writer.flush();

        }


        
}
