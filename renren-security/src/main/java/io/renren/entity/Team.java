package io.renren.entity;

import java.util.Date;

public class Team { 
        private Integer teamId;
        private String teamName;
        private String teamType;
        private User teamPresident;
        private Date teamTime;
        private String teamImage;
        private String teamIntroduce;
        public Integer getTeamId() {
                return teamId;
        }
        public void setTeamId(Integer teamId) {
                this.teamId = teamId;
        }
        public String getTeamName() {
                return teamName;
        }
        public void setTeamName(String teamName) {
                this.teamName = teamName;
        }
        public String getTeamType() {
                return teamType;
        }
        public void setTeamType(String teamType) {
                this.teamType = teamType;
        }
        public User getTeamPresident() {
                return teamPresident;
        }
        public void setTeamPresident(User teamPresident) {
                this.teamPresident = teamPresident;
        }
        public Date getTeamTime() {
                return teamTime;
        }
        public void setTeamTime(Date teamTime) {
                this.teamTime = teamTime;
        }
        public String getTeamImage() {
                return teamImage;
        }
        public void setTeamImage(String teamImage) {
                this.teamImage = teamImage;
        }
        public String getTeamIntroduce() {
                return teamIntroduce;
        }
        public void setTeamIntroduce(String teamIntroduce) {
                this.teamIntroduce = teamIntroduce;
        }       
        
        
}
