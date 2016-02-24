package org.jnit.loosecoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//ShapeCreator sc = new ShapeCreator();
		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring.xml");//bootstraping spring framework(creating spring container)
		ShapeCreator sc = appContext.getBean(ShapeCreator.class);
		Shape s = sc.getShape();
		s.drawShape();
		((ClassPathXmlApplicationContext)appContext).close();//shutting spring container
	}

}
