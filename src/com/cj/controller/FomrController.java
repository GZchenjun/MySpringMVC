package com.cj.controller;

import com.cj.bean.Admin;
import com.cj.common.bean.ControllerResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by interface on 2017/2/14.
 */
@Controller
@RequestMapping("/admin")
public class FomrController {
    @RequestMapping("pager_admin")
    public String pager(){
        return"views/form";
    }
    @RequestMapping("pager")
    public ModelAndView mov(){
        return new ModelAndView("form");
    }
    @ResponseBody
    @RequestMapping( value="adminAdd/{test}/{b}",method = RequestMethod.POST)
    public ControllerResult controllerResult(Admin admin,String aa,@PathVariable("test") String a,@PathVariable("b") int b){
        System.out.println(a);
        System.out.println(b);
        System.out.println(aa);
        System.out.println(admin.getName()+ admin.getPwd());
        return ControllerResult.getSuccessResult("注册成功");
    }
}
