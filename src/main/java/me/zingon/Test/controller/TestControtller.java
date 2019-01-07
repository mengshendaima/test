package me.zingon.Test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import me.zingon.Test.service.TestService;
import me.zingon.Test.web.ApiResponse;

@Controller
@RequestMapping("/test")
public class TestControtller extends APIController{

    @Autowired
    TestService testService;

    @RequestMapping("/list.do")
    @ResponseBody
    public Object listAll(){
        return testService.listAll();
    }

    @RequestMapping("/page.@-@")
    public String resolveTo(){
        return "/test";
    }
    
    @RequestMapping("/apirestful")
    public @ResponseBody ApiResponse test(){
    	return respOK();
    }
}
