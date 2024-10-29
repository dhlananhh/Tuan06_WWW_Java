package iuh.fit.se.xmlbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import iuh.fit.se.xmlbased.entities.Person;

public class CollectionInjection_Main {

	public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("CollectionInjection.xml");
        Person person = context.getBean("person", Person.class);
        System.out.println(person);
    }
	
}
