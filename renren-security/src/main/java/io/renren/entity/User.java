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
        /**
         * 用户ID
         */
        private Integer userId;
        /**
         * 用户名(手机号)
         */
        private String phone;

        /**
         * 昵称
         */
        private String nickname;

        /**
         * 密码
         */
        private String password;

        /**
         * 融云Token
         */
        private String token;

        

        public Integer getUserId() {
                return userId;
        }

        public void setUserId(Integer userId) {
                this.userId = userId;
        }

        public String getPhone() {
                return phone;
        }

        public void setPhone(String phone) {
                this.phone = phone;
        }

        public String getNickname() {
                return nickname;
        }

        public void setNickname(String nickname) {
                this.nickname = nickname;
        }

        public String getPassword() {
                return password;
        }

        public void setPassword(String password) {
                this.password = password;
        }

        public String getToken() {
                return token;
        }

        public void setToken(String token) {
                this.token = token;
        }

        

        public User(Integer userId, String phone, String nickname,
                        String password, String token) {
                super();
                this.userId = userId;
                this.phone = phone;
                this.nickname = nickname;
                this.password = password;
                this.token = token;
        }

        public User() {
        }

        @Override
        public String toString() {
                return "User [userId=" + userId + ", phone=" + phone
                                + ", nickname=" + nickname + ", password="
                                + password + ", token=" + token + "]";
        }
        

}
