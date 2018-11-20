package com.dream;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @Description TODO.
 * @Auther nb
 * @Date 18-11-20 下午5:13
 **/
@Configuration
@ComponentScan(basePackages ={"com.dream"},excludeFilters =
        {@ComponentScan.Filter(type= FilterType.ANNOTATION,value= EnableWebMvc.class)})
public class RootConfig {

}
