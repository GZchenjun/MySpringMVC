package com.cj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * Created by interface on 2017/2/14.
 */
@Controller
@RequestMapping("/up")
public class UploadController {

    @RequestMapping("pager")
    public String pagerFile(){
        return "upload";
    }
    @RequestMapping(value="/upfile",method= RequestMethod.POST)
    public void up(MultipartFile file){
        System.out.println(file.getName());
        try {
            file.transferTo(new File("d:/"+ file.getName()+".exe"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
