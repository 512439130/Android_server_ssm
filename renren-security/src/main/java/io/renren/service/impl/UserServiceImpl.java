package io.renren.service.impl;

import io.renren.dao.UserDao;
import io.renren.entity.User;
import io.renren.service.UserService;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userService") 
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public User getUserToken(String phone , String password) {
		return userDao.queryByPhone(phone , password);
	}
	
	@Override
	public User queryObject(Long userId) {
		return userDao.queryObject(userId);
	}

	@Override
	public List<User> queryList(Map<String, Object> map){
		return userDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map) {
		return userDao.queryTotal(map);
	}

	@Override
	@Transactional
	public void registerService(User user) {

		//sha256加密
//		user.setPassword(new Sha256Hash(user.getPassword()).toHex());
		//userDao.save(user);
	        userDao.register(user);
	}
}
