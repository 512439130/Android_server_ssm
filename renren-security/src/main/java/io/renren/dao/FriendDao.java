package io.renren.dao;

import io.renren.entity.TeamFriend;

import java.util.List;
import java.util.Map;

public interface FriendDao  {
        /**
         * 获取用户好友信息
         * 
         */
         List<TeamFriend> getFriendPhone(Map<String, Object> map);
}
