package com.xkh;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.scheduling.annotation.EnableScheduling;
/**
 * SpringBoot入口执行类
 * 入口类所在包比其他包低一级目录 否则404错误
 * SpringbootApplication
 * 创建人:何雪平 
 * 时间：2017年1月7日-下午3:52:12 
 * @version 1.0.0
 *
 */
@EnableJms 
@EnableCaching
@EnableScheduling
@SpringBootApplication
public class SpringbootApplication {

	/**
	 * 执行主方法  
	 * com.xkh 
	 * 方法名：main
	 * 创建人：何雪平 
	 * 时间：2017年1月7日-下午3:52:37 
	 * @param args void
	 * @exception 
	 * @since  1.0.0
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}
}
