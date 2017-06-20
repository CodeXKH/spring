package com.xkh.app;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.junit4.SpringRunner;

import com.xkh.component.RoncooJmsComponent;
import com.xkh.dao.bean.Users;
import com.xkh.dao.bean.mapper.UsersMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootXkhApplicationTests {


    @Autowired
    private UsersMapper usersMapper;
	
    
    @Autowired
    private JavaMailSender mailSender;


	@Autowired
	private RoncooJmsComponent roncooJmsComponent;

	@Test
	public void send() {
		roncooJmsComponent.send("hello world");
	}
 
    
    @Test
    public void testQuery() throws Exception {
        List<Users> list = usersMapper.getAllUser();
        for (Users users : list) {
			System.out.println(users.getUserName());
		}
    }

    @Test
    public void sendSimpleMail() throws Exception {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("xiaokehaotz@163.com");
        message.setTo("675534798@qq.com");
        message.setSubject("主题：简单邮件");
        message.setText("测试邮件内容");
        mailSender.send(message);
        System.out.println("发送执行了");
    }

}
