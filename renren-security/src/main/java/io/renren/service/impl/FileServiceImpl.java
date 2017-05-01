package io.renren.service.impl;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import io.renren.service.FileService;
@Service("FileService") 
public class FileServiceImpl implements FileService {

        @Override
        public boolean uploadFile(CommonsMultipartFile file) throws IllegalStateException, IOException  {
  
                String path="C:/websoft/image/"+file.getOriginalFilename();
                System.out.println(path);
                File newFile=new File(path);
                //通过CommonsMultipartFile的方法直接写文件（注意这个时候）
                file.transferTo(newFile);
                if(file != null){
                        return true;
                }else{
                        return false;
                }
                
               
        }

}
