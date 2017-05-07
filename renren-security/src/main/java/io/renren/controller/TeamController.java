package io.renren.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.renren.entity.Team;
import io.renren.entity.TeamFriend;
import io.renren.entity.TeamMember;
import io.renren.entity.TeamNews;
import io.renren.entity.User;
import io.renren.service.FriendService;
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
@RequestMapping("team")
public class TeamController {

        @Autowired
        private TeamService teamService;

        /**
         * 查询社团新闻 http://localhost:8080/renren-security/team/yy_obtain_team_news
         */
        @RequestMapping("/yy_obtain_team_news")
        @ResponseBody
        public List<TeamNews> getTeamNews() {
                List<TeamNews> teamNews = teamService.getTeamNews();
                if (teamNews != null) {
                        System.out.println("社团新闻获取成功：");
                        return teamNews;
                } else {
                        System.out.println("社团新闻获取失败");
                        return teamNews;
                }
        }

        /**
         * 查询所有社团 http://localhost:8080/renren-security/team/yy_obtain_team
         */
        @RequestMapping("/yy_obtain_team")
        @ResponseBody
        public List<Team> getTeam() {
                List<Team> team = teamService.getTeam();
                if (team != null) {
                        System.out.println("社团新闻获取成功：");
                        return team;
                } else {
                        System.out.println("社团新闻获取失败");
                        return team;
                }
        }

        /**
         * 创建社团
         * 
         * http://localhost:8080/renren-security/team/yy_add_team?Json=(
         * 包含User的Json)
         */
        @RequestMapping("/yy_add_team")
        @ResponseBody
        public int AddTeam(@RequestBody Team team) {

                if (team != null) {
                        int result = teamService.addTeam(team);
                        if (result == 1) {
                                System.out.println("创建社团请求处理成功");
                                // 社团创建成功后，同时添加创建者为本社团的社团成员的社长

                                TeamMember teamMember = new TeamMember();
                                teamMember.setUserId(team.getTeamPresident()); // 1
                                teamMember.setTeamId(team); // 2
                                teamMember.setTeamMemberPosition("社长"); // 3
                                teamMember.setTeamMemberJoinTime(team
                                                .getTeamTime()); // 4
                                // 获取系统时间(方法2)
                                // Date nowTime = new Date();
                                if (teamMember != null) {
                                        int result2 = teamService
                                                        .addTeamMember(teamMember); // 给社团成员表添加社长
                                        if (result2 == 1) {
                                                System.out.println("社长添加成员表请求处理成功");
                                                return result2;
                                        } else {
                                                System.out.println("社长添加成员表请求处理失败");
                                                return result2;
                                        }
                                }
                                return result;
                        } else {
                                System.out.println("创建社团请求处理失败");
                                return result;
                        }
                } else {
                        return 3; // 3表示请求参数为空
                }

        }

        /**
         * 加入社团处理
         * 
         * http://localhost:8080/renren-security/team/yy_add_team_member?Json=(
         * 包含User的Json)
         */
        @RequestMapping("/yy_add_team_member")
        @ResponseBody
        public int AddTeamMember(@RequestBody TeamMember teamMember) {
                if (teamMember != null) {
                        int result = teamService.addTeamMember(teamMember);
                        if (result == 1) {
                                System.out.println("加入社团处理成功");
                                return result;
                        } else {
                                System.out.println("加入社团处理失败");
                                return result;
                        }
                } else {
                        return 3; // 3表示请求参数为空
                }
        }

        /**
         * 查询我的社团的编号
         * http://localhost:8080/renren-security/team/yy_obtain_team?userId=2
         */
        @RequestMapping("/yy_obtain_team_byuser")
        @ResponseBody
        public TeamMember getTeamByUserId(String userId) {
                Map map = new HashMap();
                map.put("userId", userId);
                TeamMember teamMember = teamService.getTeamByUserId(map);
               if(teamMember != null){
                       System.out.println("社团信息获取成功"+teamMember.toString());
               }else{
                       System.out.println("社团信息获取失败");
               }
                return teamMember;
        }
}
