package io.renren.dao;

import io.renren.entity.TeamFriend;
import io.renren.entity.TeamNews;

import java.util.List;
import java.util.Map;

public interface TeamDao  {
        /**
         * 获取社团新闻
         * 
         */
         List<TeamNews> getTeamNews();
}
