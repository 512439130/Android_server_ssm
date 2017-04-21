package io.renren.service;

import io.renren.entity.TeamFriend;
import io.renren.entity.TeamNews;
import io.renren.entity.User;

import java.util.List;
import java.util.Map;

public interface TeamService {
        
        /**
         * 获取社团新闻
         * @return
         */
        List<TeamNews> getTeamNews();
	
}
