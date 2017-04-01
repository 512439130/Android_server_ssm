package io.renren.service;

import io.renren.entity.User;

import java.util.List;
import java.util.Map;

public interface UserService {
	/**
	 * 根据用户名，查询系统用户
	 */
	User queryByUserName(String username);
	
	/**
	 * 根据用户ID，查询用户
	 * @param userId
	 * @return
	 */
	User queryObject(Long userId);
	
	/**
	 * 查询用户列表
	 */
	List<User> queryList(Map<String, Object> map);
	
	/**
	 * 查询总数
	 */
	int queryTotal(Map<String, Object> map);
	
	/**
	 * 保存用户
	 */
	void registerService(User user);

}
