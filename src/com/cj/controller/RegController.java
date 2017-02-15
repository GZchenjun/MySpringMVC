package com.cj.controller;

import com.cj.bean.Admin;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by interface on 2017/2/14.
 */
@Controller
@RequestMapping("/reg")
public class RegController {
    @RequestMapping(value="reg_page",method= RequestMethod.GET)
    public ModelAndView reg(){
        ModelAndView mov = new ModelAndView("reg");
        Admin admin = new Admin();
        admin.setName("xiaoming");
        admin.setPwd("Qiopop+idsafja");
        mov.addObject(admin);
        return mov;
    }
}
