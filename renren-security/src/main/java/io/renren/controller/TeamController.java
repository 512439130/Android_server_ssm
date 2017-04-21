package io.renren.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.renren.entity.TeamFriend;
import io.renren.entity.TeamNews;
import io.renren.entity.User;
import io.renren.service.FriendService;
import io.renren.service.TeamService;
import io.renren.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("team")
public class TeamController {
        
        @Autowired
        private TeamService teamService;        
        
        /**
         * 查询社团新闻
         * http://localhost:8080/renren-security/friend/yy_obtain_team_news
         */
        @RequestMapping("/yy_obtain_team_news")
        @ResponseBody
        public List<TeamNews> getTeamNews() { 
              List<TeamNews> teamNews = teamService.getTeamNews();
                if (teamNews != null) {
                        System.out.println("社团新闻获取成功：" );
                        return teamNews;
                } else {
                        System.out.println("社团新闻获取失败");
                        return teamNews;
                }
        }

}
