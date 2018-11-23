package com.dream;

import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Description TODO.
 * @Auther nb
 * @Date 18-11-20 下午5:13
 **/
@Configuration
@ComponentScan
@ServletComponentScan(basePackages = {"com.dream.filter"})
public class RootConfig {

}
