package io.renren.entity;

public class TeamMemberRequest {
        private Integer teamMemberRequestId;
        private User requestId;
        private Integer receiveId;
        private String teamMemberRequestReason;
        private String teamMemberRequestState;
        public Integer getTeamMemberRequestId() {
                return teamMemberRequestId;
        }
        public void setTeamMemberRequestId(Integer teamMemberRequestId) {
                this.teamMemberRequestId = teamMemberRequestId;
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
        public String getTeamMemberRequestReason() {
                return teamMemberRequestReason;
        }
        public void setTeamMemberRequestReason(String teamMemberRequestReason) {
                this.teamMemberRequestReason = teamMemberRequestReason;
        }
        public String getTeamMemberRequestState() {
                return teamMemberRequestState;
        }
        public void setTeamMemberRequestState(String teamMemberRequestState) {
                this.teamMemberRequestState = teamMemberRequestState;
        }
        
       
        
      

}
