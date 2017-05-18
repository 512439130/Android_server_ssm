package io.renren.service.impl;

import io.renren.dao.CommunityDao;
import io.renren.dao.TeamDao;
import io.renren.dao.UserDao;
import io.renren.entity.Community;
import io.renren.entity.Team;
import io.renren.entity.TeamFriend;
import io.renren.entity.TeamMember;
import io.renren.entity.TeamNews;
import io.renren.entity.User;
import io.renren.service.CommunityService;
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

@Service("communityService") 
public class CommunityServiceImpl implements CommunityService {
	@Autowired
	private CommunityDao communityDao;

        @Override
        public List<Community> getCommunity() {
                // TODO Auto-generated method stub
                return communityDao.getCommunity();
        }

        @Override
        public int addCommunity(Community community) {
                // TODO Auto-generated method stub
                return communityDao.addCommunity(community);
        }


        
       
}
