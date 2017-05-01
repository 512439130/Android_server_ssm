package io.renren.service;


import io.renren.entity.FriendRequestUser;
import io.renren.entity.TeamFriend;
import io.renren.entity.User;

import java.util.List;
import java.util.Map;

public interface FriendService {
	/**
	
        /**
         * 根据user_id(phone)，查询好友信息
         */
        List<TeamFriend> getFriendPhone(Map<String, Object> map);
        
        
     
        /**
         * 发送好友请求
         */
        int setFirendRequset(FriendRequestUser friendRequestUser);
	
	
        /**
         * 处理好友请求
         */
        int operateFriendRequest(Map<String, Object> map);
        
        
        /**
         * 根据receive_phone，查询好友请求列表
         */
        List<FriendRequestUser> getFriendRequest(Map<String, Object> map);
        
        
        
        
        /**
         *添加好友
         */
        int addFriend(Map<String, Object> map);
        
	
	

}
