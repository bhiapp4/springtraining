package org.jnit.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("lifecycle.xml");//bootstraping spring framework(creating spring container)
		Author authorObj = appContext.getBean(Author.class);
		System.out.println(authorObj.getName());
		((ClassPathXmlApplicationContext)appContext).close();//shutting spring container

	}

}
