package io.renren.dao;

import io.renren.entity.Team;
import io.renren.entity.TeamFriend;
import io.renren.entity.TeamMember;
import io.renren.entity.TeamMemberRequest;
import io.renren.entity.TeamNews;

import java.util.List;
import java.util.Map;

public interface TeamMemberDao  {
        /**
         * 发送添加社团请求
         */
        int setTeamMemberRequset(TeamMemberRequest teamMemberRequest);
        
        
        /**
         * 根据receive_id，查询社团请求列表
         */
        List<TeamMemberRequest> getTeamMemberRequest(Map<String, Object> map);
        
        
        /**
         * 处理社团添加请求
         */
        int operateTeamMemberRequest(Map<String, Object> map);
        
        
        /**
         * 根据team_id，查询社团请求列表
         */
        List<TeamMember> getTeamMember(Map<String, Object> map);
}
