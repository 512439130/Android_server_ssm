package io.renren.service.impl;

import io.renren.dao.FriendDao;
import io.renren.dao.TeamDao;
import io.renren.dao.UserDao;
import io.renren.entity.Team;
import io.renren.entity.TeamFriend;
import io.renren.entity.TeamMember;
import io.renren.entity.TeamNews;
import io.renren.entity.User;
import io.renren.service.FriendService;
import io.renren.service.TeamService;
import io.renren.service.UserService;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("teamService") 
public class TeamServiceImpl implements TeamService {
	@Autowired
	private TeamDao teamDao;

        @Override
        public List<TeamNews> getTeamNews() {
                // TODO Auto-generated method stub
                
                return teamDao.getTeamNews();
        }

        @Override
        public List<Team> getTeam() {
                // TODO Auto-generated method stub
                return teamDao.getTeam();
        }

        @Override
        public int addTeam(Team team) {
                // TODO Auto-generated method stub
                return teamDao.addTeam(team);
        }

        @Override
        public int addTeamMember(TeamMember teamMember) {
                // TODO Auto-generated method stub
                return teamDao.addTeamMember(teamMember);
        }

        @Override
        public List<TeamMember> getTeamByUserId(Map<String, Object> map) {
                // TODO Auto-generated method stub
                return teamDao.getTeamByUserId(map);
        }

        @Override
        public int addTeamNews(TeamNews teamNews) {
                // TODO Auto-generated method stub
                return teamDao.addTeamNews(teamNews);
        }

        @Override
        public int updateTeamInfo(Team team) {
                // TODO Auto-generated method stub
                return teamDao.updateTeamInfo(team);
        }

     

	

    
        
        
        
        
        
       
}
