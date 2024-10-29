package iuh.fit.se.annotationbased;


import org.springframework.context.annotation.Bean;

import iuh.fit.se.annotationbased.entities.Address;
import iuh.fit.se.annotationbased.entities.Employee;


public class AppConfig {
	@Bean
    public Address address() {
        return new Address("Ho Chi Minh City", "District 1", "Vietnam");
    }

    @Bean
    public Employee employee() {
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("John Doe");
        employee.setAddress(address()); // Inject address bean
        return employee;
    }
    
}
