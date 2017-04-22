package io.renren.dao;

import io.renren.entity.FriendRequest;
import io.renren.entity.FriendRequestUser;
import io.renren.entity.TeamFriend;

import java.util.List;
import java.util.Map;

public interface FriendDao  {
        /**
         * 获取用户好友信息
         * 
         */
         List<TeamFriend> getFriendPhone(Map<String, Object> map);
         
         /**
          * 发送好友请求
          * 
          */
         int setFirendRequset(FriendRequest friendRequest);
         
         /**
          * 处理好友请求
          * @param map
          * @return
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
