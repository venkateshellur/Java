package com.UdemyLearnJava.LearnSpringBootFrameworrk.HelloWorld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


record Person(String name, int Age, Address address) {}
record Address(String addressLine1, String city) {}

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name(){ return "Venky"; }
	
	@Bean
	public int age() {return 20;}
	
	@Bean
	@Primary
	public Person person() {
		return new Person("Venky",24, new Address("Main Street", "Downtown"));
	}
	
	@Bean(name = "address2")
	@Primary
	public Address address()
	{
		return new Address("Riverchase Trail","Hoover");
	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(name(),age(), address());
	}
	
	@Bean
	public Person person3MethodCallwithParameters(String name, int age, Address address3) {
		return new Person(name,age, address3);
	}
	
	@Bean
	public Person person4MethodCallwithParameters(String name, int age, Address address) {
		return new Person(name,age, address);
	}
	
	@Bean
	public Person person4MethodCallwithQualifierParameter(String name, int age, @Qualifier("address4Qualifier") Address address) {
		return new Person(name,age, address);
	}
	
	@Bean(name = "address3")
	public Address address3()
	{
		return new Address("Idlewood","Buffalo");
	}
	
	@Bean(name = "address4")
	@Qualifier("address4Qualifier")
	public Address address4Qualifier()
	{
		return new Address("Qualifier Demo","USA");
	}
}
