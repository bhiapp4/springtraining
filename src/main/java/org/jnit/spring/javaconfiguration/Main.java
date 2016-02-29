package org.jnit.spring.javaconfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		ShapeCreator creator = appContext.getBean(ShapeCreator.class);
		Shape shape = creator.getShape();
		shape.drawShape();
		((AnnotationConfigApplicationContext)appContext).close();
	}

}
