package com.zhou.empty.sm.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhou.empty.sm.entity.User;
import com.zhou.empty.sm.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans.xml")
public class UserServiceTest {

	@Resource(name = "userService")
	UserService userService;
	
	@Test
	public void log4jTest(){
		User user = new User();
		user.setAccount("xxxxx");
		user.setName("周全");
		user.setFirstName("全");
		user.setLastName("周");
		user.setAge(18);
		user.setGender(0);
		userService.save(user);
		
		System.out.println(user.getId());
	}
}
