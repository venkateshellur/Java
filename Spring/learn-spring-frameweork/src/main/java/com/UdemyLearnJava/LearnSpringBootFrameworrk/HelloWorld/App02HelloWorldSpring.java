package com.UdemyLearnJava.LearnSpringBootFrameworrk.HelloWorld;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		// 1. Launch a Spring Context
		// 2. Configure the Spring Context

		try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("address2"));

			// System.out.println(context.getBean(Address.class));
			System.out.println(context.getBean("person2MethodCall"));
			System.out.println(context.getBean("person3MethodCallwithParameters"));
			System.out.println(context.getBean("person4MethodCallwithParameters"));

			// Get the list of Spring Beans defined
			List<String> beans = Arrays.asList(context.getBeanDefinitionNames());
			beans.stream().forEach(System.out::println);

			System.out.println(context.getBean("person4MethodCallwithQualifierParameter"));
		}
	}
}