package io.renren.service.impl;

import io.renren.dao.UserDao;
import io.renren.entity.TeamFriend;
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
	public User getUserToken(Map<String, Object> map) {
		return userDao.queryToken(map);
	}
	
	@Override
	@Transactional
	public void registerService(User user) {

	        userDao.register(user);
	}

        @Override
        public TeamFriend getFriendPhone(Map<String, Object> map) {
                // TODO Auto-generated method stub
                return  userDao.getFriendPhone(map);
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
}
