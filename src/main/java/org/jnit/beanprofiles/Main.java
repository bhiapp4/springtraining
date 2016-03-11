package org.jnit.beanprofiles;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		System.setProperty("spring.profiles.active", "dev");
		ApplicationContext appContext = new ClassPathXmlApplicationContext("beanprofiles.xml");//bootstraping spring framework(creating spring container)
		
		((ClassPathXmlApplicationContext)appContext).close();//shutting spring container

	}

}
