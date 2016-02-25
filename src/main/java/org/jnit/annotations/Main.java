package org.jnit.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring1.xml");//bootstraping spring framework(creating spring container)
		ShapeCreator sc = appContext.getBean(ShapeCreator.class);
		Shape s = sc.getShape();
		s.drawShape();
		ShapeCreator1 sc1 = appContext.getBean(ShapeCreator1.class);
		Shape s1 = sc1.getShape();
		s1.drawShape();

		((ClassPathXmlApplicationContext)appContext).close();//shutting spring container
	}

}
