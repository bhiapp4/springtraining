package org.jnit.constants;

import java.util.Map.Entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("constants.xml");//bootstraping spring framework(creating spring container)
		Employee e1 = appContext.getBean(Employee.class);
		e1.setName("Joe");
		System.out.println(e1.getCompanyName());
		System.out.println(e1.getName());
		Employee e2 = appContext.getBean(Employee.class);
		System.out.println(e2.getName());
		System.out.println(e2.getCompanyName());
		
		Clerk clerk = appContext.getBean(Clerk.class);
		for (Entry<String, String> ent : clerk.getStatesMap().entrySet()) {
			System.out.println(ent.getKey());
			System.out.println(ent.getValue());
		}
		((ClassPathXmlApplicationContext)appContext).close();//shutting spring container

	}

}
