package io.renren.service;

import io.renren.entity.FriendRequestUser;
import io.renren.entity.TaskMember;
import io.renren.entity.TaskMemberRequest;
import io.renren.entity.Team;
import io.renren.entity.TeamFriend;
import io.renren.entity.TeamMember;
import io.renren.entity.TeamMemberRequest;
import io.renren.entity.TeamNews;
import io.renren.entity.User;

import java.util.List;
import java.util.Map;

public interface TaskMemberService {
        
        /**
         * 发送报名活动请求
         */
        int setTaskMemberRequset(TaskMemberRequest taskMemberRequest);
        
        
        /**
         * 根据receive_id，查询活动报名列表
         */
        List<TaskMemberRequest> getTaskMemberRequest(Map<String, Object> map);
        
        
        /**
         * 处理活动报名请求
         */
        int operateTaskMemberRequest(Map<String, Object> map);

        /**
         * 根据task_id，查询活动报名列表
         */
        List<TaskMember> getTaskMember(Map<String, Object> map);
        
        
        /**
         * 加入活动成员
         */
        int addTaskMember(TaskMember taskMember);
        
        
        /**
         * 根据user_id，查询我的参与的活动列表
         */
        List<TaskMember> getTaskByUserId(Map<String, Object> map);
        
        /**
         * 查询活动成功报名人数
         */
        Integer getCountByTaskId(Map<String, Object> map);
        
       
        
        
        

}
