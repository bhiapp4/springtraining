package org.jnit.beanFactory;

import org.jnit.loosecoupling.Shape;
import org.jnit.loosecoupling.ShapeCreator;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class Main {

	public static void main(String[] args) {
		BeanFactory beanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader((BeanDefinitionRegistry)beanFactory);
		reader.loadBeanDefinitions(new ClassPathResource("spring.xml"));
		ShapeCreator sc = beanFactory.getBean(ShapeCreator.class);
		Shape s = sc.getShape();
		s.drawShape();
	}

}
