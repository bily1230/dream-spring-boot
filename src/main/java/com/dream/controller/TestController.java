package com.dream.controller;

import com.dream.UserYml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO.
 * @Auther nb
 * @Date 18-11-20 下午4:50
 **/
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private UserYml userYml;

    @RequestMapping("/home")
    String home() {
        return "Hello Word:"+userYml.getName();
    }

}
