package com.xkh.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

import com.xkh.intercepter.SecurityInterceptor;
/**
 * 配置拦截器
 * 
 * IntercepterConfiguration
 * 创建人:何雪平 
 * 时间：2017年2月13日-上午11:07:38 
 * @version 1.0.0
 *
 */
@Configuration
public class IntercepterConfiguration {

    /**
     * 配置拦截器
     * @author lance
     * @param registry
     */
    public void addInterceptors(InterceptorRegistry registry) {
    	//registry.addInterceptor(new SecurityInterceptor()).addPathPatterns("/user/**");
	}
}
