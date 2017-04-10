package io.renren.service;

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
	
	
        
	
	

}
