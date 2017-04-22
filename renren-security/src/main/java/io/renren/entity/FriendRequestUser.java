package io.renren.entity;

public class FriendRequestUser {
        private Integer friendrequestId;
        private User requestPhone;
        private String receivePhone;
        private String friendState;
        
       
        
        public Integer getFriendrequestId() {
                return friendrequestId;
        }
        public void setFriendrequestId(Integer friendrequestId) {
                this.friendrequestId = friendrequestId;
        }
        
        public User getRequestPhone() {
                return requestPhone;
        }
        public void setRequestPhone(User requestPhone) {
                this.requestPhone = requestPhone;
        }
        public String getReceivePhone() {
                return receivePhone;
        }
        public void setReceivePhone(String receivePhone) {
                this.receivePhone = receivePhone;
        }
        public String getFriendState() {
                return friendState;
        }
        public void setFriendState(String friendState) {
                this.friendState = friendState;
        }

}
