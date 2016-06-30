package com.demo.test;

import java.util.List;
import java.util.Map;

import org.junit.Before;
/*import org.junit.Test;*/
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.service.IUserService;

public class TestUserService {
	
	private IUserService userService;
	
	 @Before

	    public void before(){                                                                    

	        @SuppressWarnings("resource")

	        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:conf/spring.xml"

	                ,"classpath:conf/spring-mybatis.xml"});

	        userService = (IUserService) context.getBean("userServiceImpl");

	    }
	
	/*@Test*/
	@SuppressWarnings("rawtypes")
	public void testGetUser(){
		List<Map> list=this.userService.getUser();
		System.out.println(list);
	}

}
