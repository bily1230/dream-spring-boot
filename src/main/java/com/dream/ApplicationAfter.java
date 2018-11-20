package com.dream;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @Description TODO.
 * @Auther nb
 * @Date 18-11-20 下午5:33
 **/
@Component
public class ApplicationAfter implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("*******************Application after run ***************");
    }
}
