package io.renren.dao;



import java.util.List;
import java.util.Map;

import io.renren.entity.Team;
import io.renren.entity.TeamFriend;
import io.renren.entity.User;
/**
 * 系统用户
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2016年9月18日 上午9:34:11
 */
public interface UserDao extends BaseDao<User> {
	/**
	 * 根据手机号，查询用户Token
	 */
	User queryToken(Map<String, Object> map);
	
	/**
         * 根据用户名，查询用户信息
         */
        User queryUserMessage(Map<String, Object> map);
	
	/**
	 *注册
	 * @param t
	 */
	
	void register(User user);
	
	/**
	 * 用户修改密码
	 */
	int updateUserPass(Map<String, Object> map);
	
	/**
         * 查询所有用户信息
         */
	List<User> queryAllUserMessage();
	
	
	/**
         * 根据手机号，修改用户头像
         */
        int updateUserImage(Map<String, Object> map);
	
	
        /**
         * 完善社团信息
         */
        int updateUserInfo(User user);
}
