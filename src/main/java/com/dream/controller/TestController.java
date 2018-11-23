package com.dream.controller;

import com.dream.UserYml;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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

    private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);
    @Autowired
    private UserYml userYml;

    @RequestMapping("/home")
    String home() {
        LOGGER.info("xiaoming is true!");
        return "Hello Word:" + userYml.getName();
    }

}
