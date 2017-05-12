package io.renren.entity;

import java.util.Date;

public class TaskMember {
        private Integer taskMemberId;
        private User userId;
        private TeamTask taskId;
        private Date taskMemberJoinTime;
        public Integer getTaskMemberId() {
                return taskMemberId;
        }
        public void setTaskMemberId(Integer taskMemberId) {
                this.taskMemberId = taskMemberId;
        }
        
        public User getUserId() {
                return userId;
        }
        public void setUserId(User userId) {
                this.userId = userId;
        }
        public TeamTask getTaskId() {
                return taskId;
        }
        public void setTaskId(TeamTask taskId) {
                this.taskId = taskId;
        }
        public Date getTaskMemberJoinTime() {
                return taskMemberJoinTime;
        }
        public void setTaskMemberJoinTime(Date taskMemberJoinTime) {
                this.taskMemberJoinTime = taskMemberJoinTime;
        }
        
        
        
}
