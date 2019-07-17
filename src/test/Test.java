package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.UserService;
import service.impl.UserServiceImpl;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService bean = ac.getBean("userservice",UserService.class);
		bean.addUser();
		bean.delUser();
//只是做一个测试的修改
	}

}
