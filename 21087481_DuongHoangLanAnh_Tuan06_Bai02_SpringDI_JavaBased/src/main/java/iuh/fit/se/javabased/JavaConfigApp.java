package iuh.fit.se.javabased;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import iuh.fit.se.javabased.entities.Address;
import iuh.fit.se.javabased.entities.Employee;


@Configuration
public class JavaConfigApp {
	@Bean
    public Address address() {
        return new Address("Ho Chi Minh City", "District 1", "Vietnam");
    }

    @Bean
    public Employee employee() {
        return new Employee(1, "John Doe", address());
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigApp.class);
        Employee employee = context.getBean(Employee.class);
        System.out.println("Employee (Java-based): " + employee);
    }
}
