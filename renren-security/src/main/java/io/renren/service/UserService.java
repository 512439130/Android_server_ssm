package io.renren.service;

import io.renren.entity.TeamFriend;
import io.renren.entity.User;

import java.util.List;
import java.util.Map;

public interface UserService {
	/**
	 * 根据手机号，查询用户Token
	 */
	User getUserToken(Map<String, Object> map);
	
	/**
         * 根据手机号，查询用户信息
         */
        User getUserMessage(Map<String, Object> map);
	/**
         * 注册用户
         */
        void registerService(User user);
        
       
        /**
         * 根据手机号，修改用户密码
         */
        int updateUserPass(Map<String, Object> map);
        
        
        /**
         * 查询所有用户的信息
         */
        List<User> getAllUserMessage();
        
        
        
	

}
