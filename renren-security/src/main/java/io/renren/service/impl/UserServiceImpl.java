package io.renren.service.impl;

import io.renren.dao.UserDao;
import io.renren.entity.Team;
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
        public User getUserMessage(Map<String, Object> map) {
	        return userDao.queryUserMessage(map);
        }
	
	@Override
	@Transactional
	public void registerService(User user) {

	        userDao.register(user);
	}

        
	@Override
        public int updateUserPass(Map<String, Object> map) {
                return userDao.updateUserPass(map);
        }

        @Override
        public List<User> getAllUserMessage() {
                return userDao.queryAllUserMessage();
        }

        @Override
        public int updateUserImage(Map<String, Object> map) {
                return userDao.updateUserImage(map);
        }

        @Override
        public int updateUserInfo(User user) {
                // TODO Auto-generated method stub
                return userDao.updateUserInfo(user);
        }
        
        
        
	

        

        
}
