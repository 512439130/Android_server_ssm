package io.renren.dao;

import io.renren.entity.Community;
import io.renren.entity.Team;
import io.renren.entity.TeamFriend;
import io.renren.entity.TeamMember;
import io.renren.entity.TeamNews;

import java.util.List;
import java.util.Map;

public interface CommunityDao  {
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
