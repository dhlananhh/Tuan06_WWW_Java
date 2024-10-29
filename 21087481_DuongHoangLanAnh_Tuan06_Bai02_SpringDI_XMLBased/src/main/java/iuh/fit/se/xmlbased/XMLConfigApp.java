package iuh.fit.se.xmlbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import iuh.fit.se.xmlbased.entities.Employee;

public class XMLConfigApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Employee employee1 = context.getBean("employee1", Employee.class);
        System.out.println("Employee 1 (Setter Injection): " + employee1);

        Employee employee2 = context.getBean("employee2", Employee.class);
        System.out.println("Employee 2 (Constructor Injection): " + employee2);
	}
}
