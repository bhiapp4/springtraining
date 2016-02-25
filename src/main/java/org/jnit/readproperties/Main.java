package org.jnit.readproperties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("propertyReader.xml");//bootstraping spring framework(creating spring container)
		Author a = (Author)appContext.getBean("authorObj");
		System.out.println(a.getTitle());
		((ClassPathXmlApplicationContext)appContext).close();//shutting spring container

	}

}
