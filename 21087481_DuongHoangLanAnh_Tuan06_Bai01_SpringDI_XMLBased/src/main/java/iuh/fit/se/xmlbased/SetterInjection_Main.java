package iuh.fit.se.xmlbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import iuh.fit.se.xmlbased.entities.Student;

public class SetterInjection_Main {

	public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SetterInjection.xml");
        Student student1 = context.getBean("student1", Student.class);
        System.out.println(student1);
    }

}
