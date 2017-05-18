package io.renren.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import io.renren.entity.FriendRequestUser;
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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by yy on 2017/3/28.
 */
@Controller
@RequestMapping("teamMember")
public class TeamMemberController {
        
        @Autowired
        private TeamMemberService teamMemberService;        
        
       
        /**
         * 社团添加请求
         * http://localhost:8080/renren-security/teamMember/yy_team_member_request json
         * 
         */
        @RequestMapping("/yy_team_member_request")
        @ResponseBody
        public int TeamMemberRequest(@RequestBody TeamMemberRequest teamMemberRequest) {

                if (teamMemberRequest != null) {
                        int result = teamMemberService.setTeamMemberRequset(teamMemberRequest);
                        if (result == 1) {
                                System.out.println("请求处理成功");
                                return result;
                        } else {
                                System.out.println("请求处理失败");
                                return result;
                        }
                }else{
                        return 3;   //3表示请求参数为空
                }
                
                
        }
        
        /**
         * 查询哪个用户添加我的社团  
         * http://localhost:8080/renren-security/teamMember/yy_obtain_team_member_request?receiveId=9&teamMemberRequestState=insert
         */
        @RequestMapping("/yy_obtain_team_member_request")
        @ResponseBody
        public List<TeamMemberRequest> getTeamMemberRequest(String receiveId,String teamMemberRequestState) {
              Map map = new HashMap();
              map.put("receiveId", receiveId);
              map.put("teamMemberRequestState", teamMemberRequestState);

              List<TeamMemberRequest> teamMemberRequests = teamMemberService.getTeamMemberRequest(map);
                if (teamMemberRequests != null) {
                        System.out.println("获取添加列表成功：m" + teamMemberRequests.toString());
                       
                        return teamMemberRequests;
                } else {
                        System.out.println("获取添加列表失败");
                        return teamMemberRequests;
                }
        }
        
        
        /**
         * 处理社团添加请求
         *http://localhost:8080/renren-security/teamMember/yy_operate_team_member_request?requestUserId=4&receiveTeamId=9&teamMemberRequestState=agree
         */
        @RequestMapping("/yy_operate_team_member_request")
        @ResponseBody
        public int OperateTeamMemberRequest(String requestUserId, String receiveTeamId,String teamMemberRequestState) {
              Map map = new HashMap();
              map.put("requestUserId", requestUserId);
              map.put("receiveTeamId", receiveTeamId);
              map.put("teamMemberRequestState", teamMemberRequestState);
              
                int result = teamMemberService.operateTeamMemberRequest(map);
                if (result == 1) {
                        System.out.println("处理成功");
                        return result;
                } else {
                        System.out.println("处理失败");
                        return result;
                }
        }
       
        
        
        
        /**
         * 查询我的社团的社团成员列表  
         * 
         */
        @RequestMapping("/yy_obtain_team_member")
        @ResponseBody
        public List<TeamMember> getTeamMember(String teamId) {
              Map map = new HashMap();
              map.put("teamId", teamId);

              List<TeamMember> teamMemberRequests = teamMemberService.getTeamMember(map);
                if (teamMemberRequests != null) {
                        System.out.println("获取添加列表成功：m" + teamMemberRequests.toString());
                       
                        return teamMemberRequests;
                } else {
                        System.out.println("获取添加列表失败");
                        return teamMemberRequests;
                }
        }
        
        /**
         * 查询负责人的信息
         * http://localhost:8080/renren-security/teamMember/yy_obtain_team_member_by_responsible?userId=5&teamId=1
         */
        @RequestMapping("/yy_obtain_team_member_by_responsible")
        @ResponseBody
        public TeamMember getTeamMemberByResponsible( String userId,String teamId) {
                Map map = new HashMap();
                map.put("userId", userId);
                map.put("teamId", teamId);
                TeamMember teamMembers = teamMemberService.getTeamMemberByResponsible(map);
               if(teamMembers != null){
                       System.out.println("查询负责人信息成功"+teamMembers.toString());
               }else{
                       System.out.println("查询负责人信息失败");
               }
                return teamMembers;
        }
        
        
        
        
        /**
         * 处理社团成员退出
         *http://localhost:8080/renren-security/teamMember/yy_operate_team_state?teamMemberId=4&teamMemberState = '1'
         */
        @RequestMapping("/yy_operate_team_state")
        @ResponseBody
        public int operateTeamMemberState(String teamMemberId,String teamMemberState) {
              Map map = new HashMap();
              map.put("teamMemberId", teamMemberId);
              map.put("teamMemberState", teamMemberState);
              
                int result = teamMemberService.operateTeamMemberState(map);
                if (result == 1) {
                        System.out.println("退出社团处理成功");
                        return result;
                } else {
                        System.out.println("退出社团处理失败");
                        return result;
                }
        }
        
       
        
        /**
         * 改变社团成员职位
         *http://localhost:8080/renren-security/teamMember/yy_operate_team_member_position_state?userId=4&teamId=1&teamMemberPosition=部长
         */
        @RequestMapping("/yy_operate_team_member_position_state")
        @ResponseBody
        public int operateTeamMemberPositionState(String userId,String teamId,String teamMemberPosition) {
              Map map = new HashMap();
              map.put("userId", userId);
              map.put("teamId", teamId);
              map.put("teamMemberPosition", teamMemberPosition);
              
                int result = teamMemberService.operateTeamMemberPositionState(map);
                if (result == 1) {
                        System.out.println("修改社团职位处理成功");
                        return result;
                } else {
                        System.out.println("修改社团职位处理失败");
                        return result;
                }
        }
        
        
        
}
