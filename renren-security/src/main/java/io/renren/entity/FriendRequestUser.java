package io.renren.entity;

public class FriendRequestUser {
        private Integer friendrequestId;
        private User requestPhone;
        private String receivePhone;
        private String friendRequestReason;
        private String friendRequestState;
        
       
        
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
        public String getFriendRequestReason() {
                return friendRequestReason;
        }
        public void setFriendRequestReason(String friendRequestReason) {
                this.friendRequestReason = friendRequestReason;
        }
        public String getFriendRequestState() {
                return friendRequestState;
        }
        public void setFriendRequestState(String friendRequestState) {
                this.friendRequestState = friendRequestState;
        }
       

}
