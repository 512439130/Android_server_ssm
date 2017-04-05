package io.renren.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 系统用户
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2016年9月18日 上午9:28:55
 */
public class User implements Serializable {
        public User() {
        }
        
        public User(Integer userId, String userPhone, String userNickname,
                        String userPassword, String userToken) {
                super();
                this.userId = userId;
                this.userPhone = userPhone;
                this.userNickname = userNickname;
                this.userPassword = userPassword;
                this.userToken = userToken;
        }

        /**
         * 用户ID
         */
        private Integer userId;
        /**
         * 用户名(手机号)
         */
        private String userPhone;

        /**
         * 昵称
         */
        private String userNickname;

        /**
         * 密码
         */
        private String userPassword;

        /**
         * 融云Token
         */
        private String userToken;

        public Integer getUserId() {
                return userId;
        }

        public void setUserId(Integer userId) {
                this.userId = userId;
        }

        public String getUserPhone() {
                return userPhone;
        }

        public void setUserPhone(String userPhone) {
                this.userPhone = userPhone;
        }

        public String getUserNickname() {
                return userNickname;
        }

        public void setUserNickname(String userNickname) {
                this.userNickname = userNickname;
        }

        public String getUserPassword() {
                return userPassword;
        }

        public void setUserPassword(String userPassword) {
                this.userPassword = userPassword;
        }

        public String getUserToken() {
                return userToken;
        }

        public void setUserToken(String userToken) {
                this.userToken = userToken;
        }

        

       
       

       
        

}
