package com.evan.test;

import com.evan.config.MyConfig;
import com.evan.service.OrderService;
import com.evan.service.UserService;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
		ac.getBean(OrderService.class);

	}
}
