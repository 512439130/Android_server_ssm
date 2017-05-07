package io.renren.service;

import io.renren.entity.Team;
import io.renren.entity.TeamFriend;
import io.renren.entity.TeamMember;
import io.renren.entity.TeamNews;
import io.renren.entity.User;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

public interface FileService {
        /**
         * 上传文件
         * @param file
         * @return
         * @throws IOException 
         * @throws IllegalStateException 
         */

        boolean uploadFile(CommonsMultipartFile file,String serverPath)throws IllegalStateException, IOException;
	
}
