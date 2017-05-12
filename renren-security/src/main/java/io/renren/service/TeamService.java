package io.renren.service;

import io.renren.entity.Team;
import io.renren.entity.TeamFriend;
import io.renren.entity.TeamMember;
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

        /**
         * 发布社团新闻
         */
        int addTeamNews(TeamNews teamNews);
        
        /**
         * 获取所有社团
         */
        List<Team> getTeam();
        
        /**
         * 创建社团
         */
        int addTeam(Team team);
        
        /**
         * 加入社团成员
         */
        int addTeamMember(TeamMember teamMember);
        
        
        /**
         * 根据user_id，查询我的所有大学社团信息
         */
        List<TeamMember> getTeamByUserId(Map<String, Object> map);
        
        /**
         * 完善社团信息
         */
        int updateTeamInfo(Team team);
        
        
	
}
