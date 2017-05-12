package io.renren.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.renren.entity.TaskMember;
import io.renren.entity.Team;
import io.renren.entity.TeamFriend;
import io.renren.entity.TeamMember;
import io.renren.entity.TeamNews;
import io.renren.entity.TeamTask;
import io.renren.entity.User;
import io.renren.service.FriendService;
import io.renren.service.TeamService;
import io.renren.service.TeamTaskService;
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
@RequestMapping("teamTask")
public class TeamTaskController {

        @Autowired
        private TeamTaskService teamTaskService;

        /**
         * 查询所有社团活动
         * http://localhost:8080/renren-security/teamTask/yy_obtain_team_task
         */
        @RequestMapping("/yy_obtain_team_task")
        @ResponseBody
        public List<TeamTask> getTeamTask() {
                List<TeamTask> teamTask = teamTaskService.getTeamTask();
                if (teamTask != null) {
                        System.out.println("社团活动获取成功：");
                        return teamTask;
                } else {
                        System.out.println("社团活动获取失败");
                        return teamTask;
                }
        }

        /**
         * 查询负责人的社团任务 http://localhost:8080/renren-security/teamTask/
         * yy_obtain_team_member_task?teamMemberId=5
         */
        @RequestMapping("/yy_obtain_team_member_task")
        @ResponseBody
        public List<TeamTask> getTeamTaskById(Integer teamMemberId) {
                Map map = new HashMap();
                map.put("teamMemberId", teamMemberId);
                List<TeamTask> teamTask = teamTaskService.getTeamTaskById(map);
                if (teamTask != null) {
                        System.out.println("社团活动获取成功：");
                        return teamTask;
                } else {
                        System.out.println("社团活动获取失败");
                        return teamTask;
                }
        }

        /**
         * 发布社团任务
         * 
         * http://localhost:8080/renren-security/teamTask/yy_add_team_task?Json=
         * 
         */
        @RequestMapping("/yy_add_team_task")
        @ResponseBody
        public int addTeamTask(@RequestBody TeamTask teamTask) {
                if (teamTask != null) {
                        int result = teamTaskService.addTeamTask(teamTask);
                        if (result == 1) {
                                System.out.println("发布社团任务成功");
                                return result;
                        } else {
                                System.out.println("发布社团任务失败");
                                return result;
                        }
                } else {
                        return 3; // 3表示请求参数为空
                }
        }

        /**
         * 填写活动总结 
         * http://localhost:8080/renren-security/teamTask/yy_operate_team_task_summary?taskId=1&taskSummary=本次活动圆满结束
         */
        @RequestMapping("/yy_operate_team_task_summary")
        @ResponseBody
        public int setTeamTaskSummary(String taskId, String taskSummary) {
                Map map = new HashMap();
                map.put("taskId", taskId);
                map.put("taskSummary", taskSummary);
                int result = teamTaskService.setTeamTaskSummary(map);
                if (result == 1) {
                        System.out.println("处理成功");
                        return result;
                } else {
                        // 改变3条记录返回值不为1
                        System.out.println("处理失败");
                        return result;
                }
        }

        /**
         * 审核活动总结 
         * http://localhost:8080/renren-security/teamTask/yy_audit_team_task_summary?taskId=1&taskState=已结束
         */
        @RequestMapping("/yy_audit_team_task_summary")
        @ResponseBody
        public int auditTeamTaskSummary(String taskId, String taskState) {
                Map map = new HashMap();
                map.put("taskId", taskId);
                map.put("taskState", taskState);
                int result = teamTaskService.auditTeamTaskSummary(map);
                if (result == 1) {
                        System.out.println("处理成功");
                        return result;
                } else {
                        // 改变3条记录返回值不为1
                        System.out.println("处理失败");
                        return result;
                }
        }


}
