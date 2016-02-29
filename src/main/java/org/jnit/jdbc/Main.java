package org.jnit.jdbc;

import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("jdbc.xml");//bootstraping spring framework(creating spring container)
		ClerkDao clerkDao = appContext.getBean(ClerkDao.class);
		//clerkDao.createClerk(new Clerk("123-45-6789", new Date(), null, "Jack", true));
		//Clerk clerk = clerkDao.readClerk("123-45-6789");
		//System.out.println(clerk.getName());
		//List<Clerk>clerks = clerkDao.readAll();
		//clerks.forEach(c -> System.out.println(c.getName()));
		//clerkDao.updateClerk("John", "123-45-6789");
		clerkDao.deleteClerk("123-45-6789");
		((ClassPathXmlApplicationContext)appContext).close();//shutting spring container

	}

}
