package io.renren.service.impl;

import io.renren.dao.FriendDao;
import io.renren.dao.TaskMemberDao;
import io.renren.dao.TeamDao;
import io.renren.dao.TeamMemberDao;
import io.renren.dao.UserDao;
import io.renren.entity.TaskMemberRequest;
import io.renren.entity.Team;
import io.renren.entity.TeamFriend;
import io.renren.entity.TeamMember;
import io.renren.entity.TeamMemberRequest;
import io.renren.entity.TeamNews;
import io.renren.entity.User;
import io.renren.service.FriendService;
import io.renren.entity.TaskMember;
import io.renren.service.TaskMemberService;
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

@Service("taskMemberService") 
public class TaskMemberServiceImpl implements TaskMemberService {
        @Autowired
        private TaskMemberDao taskMemberDao;
        @Override
        public int setTaskMemberRequset(TaskMemberRequest taskMemberRequest) {
                // TODO Auto-generated method stub
                return taskMemberDao.setTaskMemberRequset(taskMemberRequest);
        }

        @Override
        public List<TaskMemberRequest> getTaskMemberRequest(Map<String, Object> map) {
                // TODO Auto-generated method stub
                return taskMemberDao.getTaskMemberRequest(map);
        }

        @Override
        public int operateTaskMemberRequest(Map<String, Object> map) {
                // TODO Auto-generated method stub
                return taskMemberDao.operateTaskMemberRequest(map);
        }

        @Override
        public List<TaskMember> getTaskMember(Map<String, Object> map) {
                // TODO Auto-generated method stub
                return taskMemberDao.getTaskMember(map);
        }

        @Override
        public int addTaskMember(TaskMember taskMember) {
                // TODO Auto-generated method stub
                return taskMemberDao.addTaskMember(taskMember);
        }

        @Override
        public List<TaskMember> getTaskByUserId(Map<String, Object> map) {
                // TODO Auto-generated method stub
                return taskMemberDao.getTaskByUserId(map);
        }

        @Override
        public Integer getCountByTaskId(Map<String, Object> map) {
                // TODO Auto-generated method stub
                Integer taskCount = taskMemberDao.getCountByTaskId(map);
                if(taskCount == null){
                        taskCount = 0;
                }
                return taskCount;
        }

       
	

       
}
