package io.renren.entity;

import java.util.Date;

public class Community {
        private Integer communityId;
        private TeamMember teamMemberId;
        private String communityContent;
        private String communityImage;
        private Date communityTime;
        public Integer getCommunityId() {
                return communityId;
        }
        public void setCommunityId(Integer communityId) {
                this.communityId = communityId;
        }
        public TeamMember getTeamMemberId() {
                return teamMemberId;
        }
        public void setTeamMemberId(TeamMember teamMemberId) {
                this.teamMemberId = teamMemberId;
        }
        public String getCommunityContent() {
                return communityContent;
        }
        public void setCommunityContent(String communityContent) {
                this.communityContent = communityContent;
        }
        public String getCommunityImage() {
                return communityImage;
        }
        public void setCommunityImage(String communityImage) {
                this.communityImage = communityImage;
        }
        public Date getCommunityTime() {
                return communityTime;
        }
        public void setCommunityTime(Date communityTime) {
                this.communityTime = communityTime;
        }
        
}
