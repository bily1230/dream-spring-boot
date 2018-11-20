package com.dream;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Description TODO.
 * @Auther nb
 * @Date 18-11-20 下午6:34
 **/
@Component
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "ningbin")
public class UserYml {
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private Integer age;


}
