USE mysql;
//赋权(远程访问)，想让yy用户可以远程访问YYTEST数据库 
GRANT ALL PRIVILEGES ON YYTEST.* TO 'yy'@'%' IDENTIFIED BY 'zz0114yhbb';  


CREATE DATABASE YY_association;
USE YY_association;



SHOW GLOBAL VARIABLES LIKE 'wait_timeout';  


//测试登录注册
//新用户表

CREATE TABLE tb_user(
	user_id INT PRIMARY KEY AUTO_INCREMENT,
	user_phone VARCHAR(20),
	user_nickname VARCHAR(20),
	user_password VARCHAR(20),
	user_token VARCHAR(100)
);
INSERT INTO tb_user(user_phone,user_nickname,user_password,user_token)VALUES("13160677911","yy","123456","Rvdh9fBNxZJJuhGOL1/BE9KNli1WEaZHe4TP048zEkrUZycd4jWe6Gngl1C/BIJ/o7pLgL/b10WiTD2NYoI3ddTSPnXkIGSg");
INSERT INTO tb_user(user_phone,user_nickname,user_password,user_token)VALUES("13192259530","Eilen","123456","kEHDDXYig/0O/PHxtIl3NCeao0497FbF82b4kDtaLRAlHUH15SNrQa16avq1bGuv8V5xVsl1IvyBHEBn7I7JM7sWGGrm8QQR");



SELECT * FROM tb_user;


DROP TABLE tb_user;


SELECT * FROM tb_user WHERE user_phone = 13160677911

SELECT * FROM tb_user WHERE user_phone = 13160677911 AND user_password = 123







//数据库表设计


//用户表
CREATE TABLE tb_user(
	user_id INT PRIMARY KEY AUTO_INCREMENT,
	user_phone VARCHAR(20),
	user_nickname VARCHAR(20),
	user_password VARCHAR(20),
	user_token VARCHAR(100)
);
SELECT * FROM tb_user;
DROP TABLE tb_user;

//team_president(社团创建人)

//社团表（查询全部显示所有社团信息）
CREATE TABLE tb_team(
	team_id INT PRIMARY KEY AUTO_INCREMENT,
	team_name VARCHAR(20),
	team_type VARCHAR(10),
	team_president INT,
	team_time DATETIME, 
	KEY `team_president` (`team_president`),
	CONSTRAINT `team_fk1`  FOREIGN KEY (team_president) REFERENCES tb_user(user_id)
);

SELECT * FROM tb_team;
DROP TABLE tb_team;

INSERT INTO tb_team(team_name,team_type,team_president,team_time)VALUES("计算机学院自强社","学习","1",NOW());


//team_member_position（社团职位需要插入数据库前进行封装为三种类型（社长，部长，干事））
//user_id(成员id)
//社团成员表
CREATE TABLE tb_team_member(
	team_member_id INT PRIMARY KEY AUTO_INCREMENT,
	user_id INT,
	team_id INT,
	team_member_position VARCHAR(10),
	team_member_join_time DATETIME, 	
	KEY `user_id` (`user_id`),
	CONSTRAINT `team_member_fk1`  FOREIGN KEY (user_id) REFERENCES tb_user(user_id),
	KEY `team_id` (`team_id`),
	CONSTRAINT `team_member_fk2`  FOREIGN KEY (team_id) REFERENCES tb_team(team_id)
);
SELECT * FROM tb_team_member;

INSERT INTO tb_team_member(user_id,team_id,team_member_position,team_member_join_time)VALUES(1,1,"社长",NOW());
INSERT INTO tb_team_member(user_id,team_id,team_member_position,team_member_join_time)VALUES(2,1,"部长",NOW());

DROP TABLE tb_team_member;

//task_state(正在进行，已结束)task_number：活动人数
//社团任务表
CREATE TABLE tb_task(
	task_id INT PRIMARY KEY AUTO_INCREMENT,
	task_tile VARCHAR(20),
	task_content VARCHAR(100),
	task_release_id INT,
	task_responsible_id INT,
	task_state VARCHAR(10),
	task_number INT,
	KEY `task_release_id` (`task_release_id`),
	CONSTRAINT `task_fk1`  FOREIGN KEY (task_release_id) REFERENCES tb_team_member(team_member_id),
	KEY `task_responsible_id` (`task_responsible_id`),
	CONSTRAINT `task_fk2`  FOREIGN KEY (task_responsible_id) REFERENCES tb_team_member(team_member_id)

);
SELECT * FROM tb_task;

INSERT INTO tb_task(task_tile,task_content,task_release_id,task_responsible_id,task_state,task_number)VALUES("纳新","国庆结束开始社团纳新",1,2,"正在进行",50);

DROP TABLE tb_task;




//任务成员表(用户报名活动)
CREATE TABLE tb_task_member(
	task_member_id INT PRIMARY KEY AUTO_INCREMENT,
	user_id INT,
	task_id INT,
	KEY `user_id` (`user_id`),
	CONSTRAINT `task_member_fk1`  FOREIGN KEY (user_id) REFERENCES tb_user(user_id),
	KEY `task_id` (`task_id`),
	CONSTRAINT `task_member_fk2`  FOREIGN KEY (task_id) REFERENCES tb_task(task_id)
);
SELECT * FROM tb_task_member;

INSERT INTO tb_task_member(user_id,task_id)VALUES(3,1);

SELECT COUNT(*) FROM tb_task_member;    //活动报名人数    

DROP TABLE tb_task_member;




//用户好友表
CREATE TABLE tb_friend(
	friend_id INT PRIMARY KEY AUTO_INCREMENT,
	friend_phone VARCHAR(20),
	friend_remark VARCHAR(20),
	KEY `friend_phone` (`friend_phone`),
	CONSTRAINT `friend_fk1`  FOREIGN KEY (friend_phone) REFERENCES tb_user(user_phone)
);
SELECT * FROM tb_friend;

INSERT INTO tb_friend(user_id,task_id)VALUES(3,1);

SELECT COUNT(*) FROM tb_task_member;    //活动报名人数    

DROP TABLE tb_friend;





//社团圈表
CREATE TABLE tb_community(
	community_id INT PRIMARY KEY AUTO_INCREMENT,
	team_member_id INT,
	community_userid INT,
	community_content VARCHAR(20),
	community_image VARCHAR(50),
	community_time DATETIME, 
	KEY `team_member_id` (`team_member_id`),
	CONSTRAINT `community_fk1`  FOREIGN KEY (team_member_id) REFERENCES tb_team_member(team_member_id)
);
SELECT * FROM tb_community;
DROP TABLE tb_community;



//社团圈点赞表
CREATE TABLE tb_approval(
	approval_id INT PRIMARY KEY AUTO_INCREMENT,
	community_id INT,
	approval_userid VARCHAR(20),
	
	KEY `community_id` (`community_id`),
	CONSTRAINT `approval_fk1`  FOREIGN KEY (community_id) REFERENCES tb_community(community_id)
);
SELECT * FROM tb_approval;
DROP TABLE tb_approval;

//社团圈评论表
CREATE TABLE tb_comment(
	comment_id INT PRIMARY KEY AUTO_INCREMENT,
	community_id INT,
	comment_userid INT,
	comment_parentid INT,
	comment_content VARCHAR(50),
	comment_time DATETIME, 
	KEY `community_id` (`community_id`),
	CONSTRAINT `comment_fk1`  FOREIGN KEY (community_id) REFERENCES tb_community(community_id)
);
SELECT * FROM tb_comment;
DROP TABLE tb_comment;

