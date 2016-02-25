package org.jnit.beanwiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("beanwiring.xml");//bootstraping spring framework(creating spring container)
		ShapeCreator sc = appContext.getBean(ShapeCreator.class);
		Circle circle = sc.getCircle();
		circle.drawCircle();
		((ClassPathXmlApplicationContext)appContext).close();//shutting spring container
	}

}
