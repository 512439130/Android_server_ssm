package io.renren.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.renren.entity.TeamFriend;
import io.renren.entity.User;
import io.renren.service.FriendService;
import io.renren.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("friend")
public class FriendController {
        
        @Autowired
        private FriendService friendService;        
        
        /**
         * 查询用户的好友列表
         * http://localhost:8080/renren-security/friend/yy_obtain_friend?user_id=13160677911
         */
        @RequestMapping("/yy_obtain_friend")
        @ResponseBody
        public List<TeamFriend> getFriend(String user_id) {
              Map map = new HashMap();
              map.put("userPhone", user_id);
              System.out.print(user_id);
              List<TeamFriend> teamFriend = friendService.getFriendPhone(map);
                if (teamFriend != null) {
                        System.out.println("好友信息：" + teamFriend.toString());
                       
                        return teamFriend;
                } else {
                        System.out.println("暂时无好友");
                        return teamFriend;
                }
        }

}
