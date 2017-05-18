package io.renren.service;

import io.renren.entity.Community;
import io.renren.entity.Team;
import io.renren.entity.TeamFriend;
import io.renren.entity.TeamMember;
import io.renren.entity.TeamNews;
import io.renren.entity.User;

import java.util.List;
import java.util.Map;

public interface CommunityService {
        
        /**
         * 获取社团圈
         * @return
         */
        List<Community> getCommunity();

        /**
         * 发送社团圈
         */
        int addCommunity(Community community);
        
	
}
