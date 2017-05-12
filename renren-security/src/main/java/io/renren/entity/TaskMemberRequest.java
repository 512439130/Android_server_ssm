package io.renren.entity;

public class TaskMemberRequest {
        private Integer taskMemberRequestId;
        private User requestId;
        private Integer receiveId;
        private String taskMemberRequestReason;
        private String taskMemberRequestState;
        public Integer getTaskMemberRequestId() {
                return taskMemberRequestId;
        }
        public void setTaskMemberRequestId(Integer taskMemberRequestId) {
                this.taskMemberRequestId = taskMemberRequestId;
        }
        public User getRequestId() {
                return requestId;
        }
        public void setRequestId(User requestId) {
                this.requestId = requestId;
        }
        public Integer getReceiveId() {
                return receiveId;
        }
        public void setReceiveId(Integer receiveId) {
                this.receiveId = receiveId;
        }
        public String getTaskMemberRequestReason() {
                return taskMemberRequestReason;
        }
        public void setTaskMemberRequestReason(String taskMemberRequestReason) {
                this.taskMemberRequestReason = taskMemberRequestReason;
        }
        public String getTaskMemberRequestState() {
                return taskMemberRequestState;
        }
        public void setTaskMemberRequestState(String taskMemberRequestState) {
                this.taskMemberRequestState = taskMemberRequestState;
        }
        
        
}
