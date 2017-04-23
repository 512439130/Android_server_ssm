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
	
}
