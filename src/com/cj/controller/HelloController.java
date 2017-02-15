package com.cj.controller;

import com.cj.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by interface on 2017/2/13.
 */
@Controller
@RequestMapping("/")
public class HelloController {
    @RequestMapping("hello")
    public ModelAndView hello(){
        ModelAndView mav = new ModelAndView("hello");
        mav.addObject("key","junxuan");
        return mav;
    }
    @ResponseBody//返回的json数据
    @RequestMapping("user")
    public User andUser(){
        User us = new User();
        us.setId(1001);
        us.setName("junxuan");
        return us;
    }

}
