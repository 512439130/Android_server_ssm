package io.renren.controller;

import java.awt.image.BufferedImage;
import java.io.IOException;

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
public class UiLoginController {
	@Autowired
	private UserService userService;

    /**
     * 获取登录页面
     * @return
     */
	@RequestMapping("getLogin")
	public String getLogin(){
		return "login";
	}


	/**
	 * 提交登录
	 */
	@RequestMapping("login")
	public ModelAndView login(String username, String password, HttpSession session)throws IOException {
		ModelAndView mav = new ModelAndView();
		User user = userService.queryByUserName(username);
		if (user == null || !user.getPassword().equals(password)){
			mav.addObject("msg","账号或密码不正确");
			mav.addObject("username",username);
			mav.setViewName("login");
			return mav;
		}
		session.setAttribute("user",user);
		mav.setViewName("redirect:user/index"); //登录成功重定向到用户列表 (UserController:index)
		return mav;
	}

	@RequestMapping("/register")
	public String register(){
		return "register";   //返回注册页面
	}
	
	/**
	 * 退出
	 */
	@RequestMapping(value = "logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:login";
	}
	
}
