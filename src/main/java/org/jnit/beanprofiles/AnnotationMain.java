package org.jnit.beanprofiles;

import org.jnit.spring.javaconfiguration.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//you can add this property to ur catalina properties
//you can add this as a system/env property in the machine where your application is running
public class AnnotationMain {

	public static void main(String[] args) {
		System.setProperty("spring.profiles.active", "dev");
		ApplicationContext appContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		((AnnotationConfigApplicationContext)appContext).close();

	}

}
