package org.jnit.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
//Spring after injecting dependencies it actually checks if you bean class is implementing certian interfaces
//NameAwareInterface
public class Author implements BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean{

	private Book book;
	private String name;
	
	public void setBook(Book book) {
		this.book = book;
	}
	
	public Book getBook() {
		return book;
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("The name of the bean is "+name);
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		Book b = beanFactory.getBean(Book.class);
		System.out.println(b.getName());
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("All the propeties are set and dependencies are injected, we can do something..");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Author bean is being destroyed...");
		
	}
}
