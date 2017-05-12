package io.renren.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;


import io.renren.entity.TaskMemberRequest;
import io.renren.entity.TeamMember;

import io.renren.entity.TaskMember;
import io.renren.service.TaskMemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by yy on 2017/3/28.
 */
@Controller
@RequestMapping("taskMember")
public class TaskMemberController {
        
        @Autowired
        private TaskMemberService taskMemberService;        
        
       
        /**
         * 活动添加请求
         * http://localhost:8080/renren-security/taskMember/yy_task_member_request json
         * 
         */
        @RequestMapping("/yy_task_member_request")
        @ResponseBody
        public int TaskMemberRequest(@RequestBody TaskMemberRequest taskMemberRequest) {

                if (taskMemberRequest != null) {
                        int result = taskMemberService.setTaskMemberRequset(taskMemberRequest);
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
         * 查询哪个用户添加我的活动
         * http://localhost:8080/renren-security/taskMember/yy_obtain_task_member_request?receiveId=1&taskMemberRequestState=insert
         * receive_id:任务编号
         */
        @RequestMapping("/yy_obtain_task_member_request")
        @ResponseBody
        public List<TaskMemberRequest> getTaskMemberRequest(String receiveId,String taskMemberRequestState) {
              Map map = new HashMap();
              map.put("receiveId", receiveId);
              map.put("taskMemberRequestState", taskMemberRequestState);

              List<TaskMemberRequest> taskMemberRequests = taskMemberService.getTaskMemberRequest(map);
                if (taskMemberRequests != null) {
                        System.out.println("获取添加列表成功：m" + taskMemberRequests.toString());
                       
                        return taskMemberRequests;
                } else {
                        System.out.println("获取添加列表失败");
                        return taskMemberRequests;
                }
        }
        
        
        /**
         * 处理社团添加请求
         *http://localhost:8080/renren-security/taskMember/yy_operate_task_member_request?requestUserId=5&receiveTaskId=1&taskMemberRequestState=agree
         */
        @RequestMapping("/yy_operate_task_member_request")
        @ResponseBody
        public int OperateTaskMemberRequest(String requestUserId, String receiveTaskId,String taskMemberRequestState) {
              Map map = new HashMap();
              map.put("requestUserId", requestUserId);
              map.put("receiveTaskId", receiveTaskId);
              map.put("taskMemberRequestState", taskMemberRequestState);
              
                int result = taskMemberService.operateTaskMemberRequest(map);
                if (result == 1) {
                        System.out.println("处理成功");
                        return result;
                } else {
                        //改变3条记录返回值不为1
                        System.out.println("处理失败");
                        return result;
                }
        }
       
        
        
        
        /**
         * 获取社团活动成员列表  
         * http://localhost:8080/renren-security/taskMember/yy_obtain_task_member?taskId = 1
         */
        @RequestMapping("/yy_obtain_task_member")
        @ResponseBody
        public List<TaskMember> getTaskMember(String taskId) {
              Map map = new HashMap();
              map.put("taskId", taskId);

              List<TaskMember> taskMembers= taskMemberService.getTaskMember(map);
                if (taskMembers != null) {
                        System.out.println("获取活动成员成功：m" + taskMembers.toString());            
                        return taskMembers;
                } else {
                        System.out.println("获取活动成员失败");
                        return taskMembers;
                }
        }
        
        
       
        /**
         * 加入活动处理
         * 
         * http://localhost:8080/renren-security/taskMember/yy_add_task_member?Json=
         * 
         */
        @RequestMapping("/yy_add_task_member")
        @ResponseBody
        public int addTaskMember(@RequestBody TaskMember taskMember) {
                if (taskMember != null) {
                        int result = taskMemberService.addTaskMember(taskMember);
                        if (result == 1) {
                                System.out.println("加入活动处理成功");
                                return result;
                        } else {
                                System.out.println("加入活动处理失败");
                                return result;
                        }
                } else {
                        return 3; // 3表示请求参数为空
                }
        }
        
        
        
        /**
         * 查询我参与的所有活动
         * http://localhost:8080/renren-security/taskMember/yy_obtain_task_byuser?userId=5
         */
        @RequestMapping("/yy_obtain_task_byuser")
        @ResponseBody
        public List<TaskMember> getTaskByUserId(String userId) {
                Map map = new HashMap();
                map.put("userId", userId);
                List<TaskMember> taskMembers = taskMemberService.getTaskByUserId(map);
               if(taskMembers != null){
                       System.out.println("活动列表获取成功"+taskMembers.toString());
               }else{
                       System.out.println("活动列表获取失败");
               }
                return taskMembers;
        }
        
        /**
         * 查询活动成功报名人数
         * http://localhost:8080/renren-security/taskMember/yy_obtain_task_count_bytask?taskId=1
         */
        @RequestMapping("/yy_obtain_task_count_bytask")
        @ResponseBody
        public Integer getCountByTaskId(String taskId) {
                Map map = new HashMap();
                map.put("taskId", taskId);
                Integer taskCount = taskMemberService.getCountByTaskId(map);
                return taskCount;
        }
        
        
        
       
                
        
        
        
        
        
        
}
