package org.jnit.spring.javaconfiguration;

import java.util.Arrays;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages={"org.jnit.spring.javaconfiguration"})
//@PropertySource("classpath:app.properies")
@PropertySources({@PropertySource("classpath:app.properies"), @PropertySource("classpath:connection.properties")})
public class SpringConfiguration {
 
	public static List<String>COUNTRIES = Arrays.asList("NY","NJ");
	
	@Autowired
	private Environment env;
	
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
		System.out.println(env.getProperty("appName"));
		return new ShapeCreator(getTraingle());
	}	
	
	@Bean
	public JdbcTemplate getJdbcTemplate(){
		JdbcTemplate template = new JdbcTemplate(getDataSource());
		return template;
	}
	
	@Bean
	public DataSource getDataSource(){
		DriverManagerDataSource datasource = new DriverManagerDataSource(env.getProperty("database.url"), env.getProperty("database.username"), null);
		return datasource;
	}
}
