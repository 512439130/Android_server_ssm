package io.renren.entity;

import java.util.Date;

public class TeamMember {
        private Integer teamMemberId;
        private User userId;
        private Team teamId;
        private String teamMemberPosition;
        private Date teamMemberJoin;
        public Integer getTeamMemberId() {
                return teamMemberId;
        }
        public void setTeamMemberId(Integer teamMemberId) {
                this.teamMemberId = teamMemberId;
        }
        public User getUserId() {
                return userId;
        }
        public void setUserId(User userId) {
                this.userId = userId;
        }
        public Team getTeamId() {
                return teamId;
        }
        public void setTeamId(Team teamId) {
                this.teamId = teamId;
        }
        public String getTeamMemberPosition() {
                return teamMemberPosition;
        }
        public void setTeamMemberPosition(String teamMemberPosition) {
                this.teamMemberPosition = teamMemberPosition;
        }
        public Date getTeamMemberJoin() {
                return teamMemberJoin;
        }
        public void setTeamMemberJoin(Date teamMemberJoin) {
                this.teamMemberJoin = teamMemberJoin;
        }
        
        
        
        
        
}
