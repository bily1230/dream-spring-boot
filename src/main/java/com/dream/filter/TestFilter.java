package com.dream.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @Description TODO.
 * @Auther nb
 * @Date 18-11-22 下午9:03
 **/
@WebFilter(urlPatterns="/test/*")
public class TestFilter implements Filter {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestFilter.class);
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        LOGGER.info("*******Filter test********");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
