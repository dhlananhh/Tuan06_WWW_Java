package iuh.fit.se.annotationbased;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import iuh.fit.se.annotationbased.entities.Employee;


@Configuration
public class AnnotationBasedApp {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Employee employee = context.getBean(Employee.class);
        System.out.println("Employee (Annotation-based): " + employee);
	}
}
