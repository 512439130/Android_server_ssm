package io.renren.entity;

import java.util.Date;

public class TeamNews {
       
        private Integer newsId;
        private Team teamId;
        private String newsTitle;
        private Date newsTime;
        private String newsContent;
        private String newsImage;
        public Integer getNewsId() {
                return newsId;
        }
        public void setNewsId(Integer newsId) {
                this.newsId = newsId;
        }
        public Team getTeamId() {
                return teamId;
        }
        public void setTeamId(Team teamId) {
                this.teamId = teamId;
        }
        
        public String getNewsTitle() {
                return newsTitle;
        }
        public void setNewsTitle(String newsTitle) {
                this.newsTitle = newsTitle;
        }
        public Date getNewsTime() {
                return newsTime;
        }
        public void setNewsTime(Date newsTime) {
                this.newsTime = newsTime;
        }
        public String getNewsContent() {
                return newsContent;
        }
        public void setNewsContent(String newsContent) {
                this.newsContent = newsContent;
        }
        public String getNewsImage() {
                return newsImage;
        }
        public void setNewsImage(String newsImage) {
                this.newsImage = newsImage;
        }
        
        
        
}
