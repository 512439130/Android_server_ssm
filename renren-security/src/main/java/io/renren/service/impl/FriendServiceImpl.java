package io.renren.service.impl;

import io.renren.dao.FriendDao;
import io.renren.dao.UserDao;

import io.renren.entity.TeamFriend;
import io.renren.entity.User;
import io.renren.entity.FriendRequestUser;
import io.renren.service.FriendService;
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

@Service("friendService") 
public class FriendServiceImpl implements FriendService {
	@Autowired
	private FriendDao friendDao;

	

        @Override
        public  List<TeamFriend> getFriendPhone(Map<String, Object> map) {
                // TODO Auto-generated method stub
                return  friendDao.getFriendPhone(map);
        }

        @Override
        public int setFirendRequset(FriendRequestUser friendRequestUser) {
                // TODO Auto-generated method stub
               return friendDao.setFirendRequset(friendRequestUser);
        }

        @Override
        public int operateFriendRequest(Map<String, Object> map) {
                // TODO Auto-generated method stub
              
                return friendDao.operateFriendRequest(map);
        }

        @Override
        public List<FriendRequestUser> getFriendRequest(Map<String, Object> map) {
                // TODO Auto-generated method stub
                return  friendDao.getFriendRequest(map);
        }

        @Override
        public int addFriend(Map<String, Object> map) {
                // TODO Auto-generated method stub
                return friendDao.addFriend(map);
        }
       
}
