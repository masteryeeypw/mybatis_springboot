package com.demo.controller;

import com.demo.entity.User;
import com.demo.service.IUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author yipingwei
 * @describe
 * @Date 2023/3/17 10:43
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Resource
    private IUserService iUserService;

    @RequestMapping("test01")
    public String test01() {
        User one = iUserService.getOne();
        return one.toString();

    }

}
