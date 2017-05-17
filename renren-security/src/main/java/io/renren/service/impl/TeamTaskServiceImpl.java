package io.renren.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.renren.dao.TeamMemberDao;
import io.renren.dao.TeamTaskDao;
import io.renren.entity.TeamTask;
import io.renren.service.TeamTaskService;
@Service("teamTaskService") 
public class TeamTaskServiceImpl implements TeamTaskService {
        @Autowired
        private TeamTaskDao teamTaskDao;
        @Override
        public List<TeamTask> getTeamTask() {
                // TODO Auto-generated method stub
                return teamTaskDao.getTeamTask();
        }
        @Override
        public List<TeamTask> getTeamTaskById(Map<String, Object> map) {
                // TODO Auto-generated method stub
                return teamTaskDao.getTeamTaskById(map);
        }
        @Override
        public int addTeamTask(TeamTask teamTask) {
                // TODO Auto-generated method stub
                return teamTaskDao.addTeamTask(teamTask);
        }
        @Override
        public int setTeamTaskSummary(Map<String, Object> map) {
                // TODO Auto-generated method stub
                return teamTaskDao.setTeamTaskSummary(map);
        }
        @Override
        public int auditTeamTaskSummary(Map<String, Object> map) {
                // TODO Auto-generated method stub
                return teamTaskDao.auditTeamTaskSummary(map);
        }
        @Override
        public List<TeamTask> getTeamTaskByTeamId(Map<String, Object> map) {
                // TODO Auto-generated method stub
                return teamTaskDao.getTeamTaskByTeamId(map);
        }

}
