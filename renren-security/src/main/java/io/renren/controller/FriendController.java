package io.renren.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.renren.entity.FriendRequest;
import io.renren.entity.TeamFriend;
import io.renren.entity.User;
import io.renren.entity.FriendRequestUser;
import io.renren.service.FriendService;
import io.renren.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
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
        
        
        /**
         * 好友添加请求
         * 
         * http://localhost:8080/renren-security/friend/yy_friend_request json
         */
        @RequestMapping("/yy_friend_request")
        @ResponseBody
        public int FriendRequestUser(@RequestBody FriendRequest friendRequest) {

                if (friendRequest != null) {
                        int result = friendService.setFirendRequset(friendRequest);
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
         * 处理好友的请求
         * http://localhost:8080/renren-security/friend/yy_operate_friendrequest?requestPhoneNumber=13160677911&receivePhone=13192259530&friendState=refuse
         */
        @RequestMapping("/yy_operate_friendrequest")
        @ResponseBody
        public int OperateFriendRequest(String requestPhoneNumber, String receivePhone,String friendState) {
              Map map = new HashMap();
              map.put("requestPhoneNumber", requestPhoneNumber);
              map.put("receivePhone", receivePhone);
              map.put("friendState", friendState);
              
                int result = friendService.operateFriendRequest(map);
                if (result == 1) {
                        System.out.println("处理成功");
                        return result;
                } else {
                        System.out.println("处理失败");
                        return result;
                }
        }
        
        
        /**
         * 查询哪个用户添加我
         * http://localhost:8080/renren-security/friend/yy_obtain_friendrequest?receivePhone=13160677911&friendState=insert
         */
        @RequestMapping("/yy_obtain_friendrequest")
        @ResponseBody
        public List<FriendRequestUser> getFriendRequest(String receivePhone,String friendState) {
              Map map = new HashMap();
              map.put("receivePhone", receivePhone);
              map.put("friendState", friendState);

              List<FriendRequestUser> friendRequestUsers = friendService.getFriendRequest(map);
                if (friendRequestUsers != null) {
                        System.out.println("获取添加列表成功：" + friendRequestUsers.toString());
                       
                        return friendRequestUsers;
                } else {
                        System.out.println("获取添加列表失败");
                        return friendRequestUsers;
                }
        }
        
        
        /**
         * 添加好友表请求
         * 
         * http://localhost:8080/renren-security/friend/yy_add_friend?userId=13160677911&friendPhone=13192259530
         */
        @RequestMapping("/yy_add_friend")
        @ResponseBody
        public int addFriend(String userId,String friendPhone) {
                Map map = new HashMap();
                map.put("userId", userId);
                map.put("friendPhone", friendPhone);
                
               int result = friendService.addFriend(map);
               if (result == 1) {
                       System.out.println("添加好友处理成功");
                       return result;
               } else {
                       System.out.println("添加好友处理失败");
                       return result;
               }
        }

}
