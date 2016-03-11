package org.jnit.beanprofiles;

import java.util.Arrays;
import java.util.List;

import javax.sql.DataSource;

import org.jnit.spring.javaconfiguration.Circlular;
import org.jnit.spring.javaconfiguration.Rectangle;
import org.jnit.spring.javaconfiguration.ShapeCreator;
import org.jnit.spring.javaconfiguration.Triangle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages={"org.jnit.spring.javaconfiguration"})
public class SpringConfiguration {
 
	public static List<String>COUNTRIES = Arrays.asList("NY","NJ");
		
	@Bean(name="circle")
	@Scope(value="singleton")
	public Circlular getCircle(){
		return new Circlular();
	}
	
	@Bean
	public Triangle getTraingle(){
		return new Triangle();
	}
	
	@Bean
	public Rectangle getRectangle(){
		return new Rectangle();
	}
	
	@Bean
	public ShapeCreator getShapeCreator(){
		return new ShapeCreator(getTraingle());
	}	
	
	@Bean
	public JdbcTemplate getJdbcTemplate(){
		JdbcTemplate template = new JdbcTemplate(getDataSource());
		return template;
	}
	
	@Bean
	@Profile("dev")
	public DataSource getDataSource(){
		DriverManagerDataSource datasource = new DriverManagerDataSource("jdbc:mysql://localhost:3306/javatraining", "root", null);
		return datasource;
	}
	
	@Bean
	@Profile("prod")
	public DataSource getDataSourceProd(){
		DriverManagerDataSource datasource = new DriverManagerDataSource("jdbc:mysql://produrl:3306/javatraining", "prodUserName", "prodPassword");
		return datasource;
	}

}
