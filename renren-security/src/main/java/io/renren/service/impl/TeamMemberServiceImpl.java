package io.renren.service.impl;

import io.renren.dao.FriendDao;
import io.renren.dao.TeamDao;
import io.renren.dao.TeamMemberDao;
import io.renren.dao.UserDao;
import io.renren.entity.Team;
import io.renren.entity.TeamFriend;
import io.renren.entity.TeamMember;
import io.renren.entity.TeamMemberRequest;
import io.renren.entity.TeamNews;
import io.renren.entity.User;
import io.renren.service.FriendService;
import io.renren.service.TeamMemberService;
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

@Service("teamMemberService") 
public class TeamMemberServiceImpl implements TeamMemberService {
        @Autowired
        private TeamMemberDao teamMemberDao;
        @Override
        public int setTeamMemberRequset(TeamMemberRequest teamMemberRequest) {
                // TODO Auto-generated method stub
                return teamMemberDao.setTeamMemberRequset(teamMemberRequest);
        }

        @Override
        public List<TeamMemberRequest> getTeamMemberRequest(
                        Map<String, Object> map) {
                // TODO Auto-generated method stub
                return teamMemberDao.getTeamMemberRequest(map);
        }

        @Override
        public int operateTeamMemberRequest(Map<String, Object> map) {
                // TODO Auto-generated method stub
                return teamMemberDao.operateTeamMemberRequest(map);
        }

        @Override
        public List<TeamMember> getTeamMember(Map<String, Object> map) {
                // TODO Auto-generated method stub
                return teamMemberDao.getTeamMember(map);
        }
	

       
}
