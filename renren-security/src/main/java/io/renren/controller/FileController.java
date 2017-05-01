package io.renren.controller;


import io.renren.service.FileService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;



import java.io.IOException;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by yy on 2017/3/28.
 */
@Controller
@RequestMapping("file")
public class FileController {
        @Autowired
        private FileService fileService;

        /**
         * 上传图片
         * 
         * @param user
         * @return
         * @throws IOException 
         * @throws IllegalStateException 
         */
        @RequestMapping("/yy_upload_file")
        public String uploadFile(@RequestParam("image") CommonsMultipartFile file)throws IllegalStateException, IOException {
                if (file != null) {
                        boolean result = fileService.uploadFile(file);
                        if(result){
                                return "上传成功";   
                        }else{
                                return "上传失败";
                        }  
                } else {
                        return "上传文件为空";
                }
        }

       
}
