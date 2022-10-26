package org.jnit.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring1.xml");//bootstraping spring framework(creating spring container)
		ShapeCreator1 sc1 = appContext.getBean(ShapeCreator1.class);
		Shape s1 = sc1.getShape();
		s1.drawShape();
		ShapeCreator2 sc2 = appContext.getBean(ShapeCreator2.class);
		Shape s2 = sc2.getShape();
		s1.drawShape();
		ShapeCreator3 sc3 = appContext.getBean(ShapeCreator3.class);
		Shape s3 =sc3.getShape();
		s3.drawShape(); //sc3.getShape().drawShape();
		
		

		((ClassPathXmlApplicationContext)appContext).close();//shutting spring container
	}

}
