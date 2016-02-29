package org.jnit.lookupmethodDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("lookupmethodi.xml");//bootstraping spring framework(creating spring container)
		A aObj = appContext.getBean(A.class);
		B bobj = aObj.getBInstance();
		bobj.print();
		((ClassPathXmlApplicationContext)appContext).close();//shutting spring container

	}

}
