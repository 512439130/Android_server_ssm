package io.renren.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.renren.entity.Community;
import io.renren.entity.Team;
import io.renren.entity.TeamFriend;
import io.renren.entity.TeamMember;
import io.renren.entity.TeamNews;
import io.renren.entity.User;
import io.renren.service.CommunityService;
import io.renren.service.TeamService;
import io.renren.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by yy on 2017/5/18.
 */
@Controller
@RequestMapping("community")
public class CommunityController {

        @Autowired
        private CommunityService communityService;

        /**
         * 查询社团圈 http://localhost:8080/renren-security/community/yy_obtain_community
         */
        @RequestMapping("/yy_obtain_community")
        @ResponseBody
        public List<Community> getCommunity() {
                List<Community> communities = communityService.getCommunity();
                if (communities != null) {
                        System.out.println("社团圈获取成功：");
                        return communities;
                } else {
                        System.out.println("社团圈获取失败");
                        return communities;
                }
        }
        
        
        /**
         * 发布社团圈
         * http://localhost:8080/renren-security/community/yy_add_community?Json=
         * 
         */
        @RequestMapping("/yy_add_community")
        @ResponseBody
        public int addCommunity(@RequestBody Community community) {

                if (community != null) {
                        int result = communityService.addCommunity(community);
                        if (result == 1) {
                                System.out.println("发布社团圈成功");
                                return result;
                        } else {
                                System.out.println("发布社团圈失败");
                                return result;
                        }
                } else {
                        return 3; // 3表示请求参数为空
                }

        }
        
        
        
}
