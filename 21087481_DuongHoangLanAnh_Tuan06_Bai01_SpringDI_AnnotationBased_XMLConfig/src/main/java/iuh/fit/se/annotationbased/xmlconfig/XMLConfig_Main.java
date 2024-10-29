package iuh.fit.se.annotationbased.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import iuh.fit.se.annotationbased.xmlconfig.entities.Group;
import iuh.fit.se.annotationbased.xmlconfig.entities.User;


public class XMLConfig_Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = context.getBean("user", User.class);
        System.out.println("User: " + user);

        Group group = context.getBean("group", Group.class);
        System.out.println("Group: " + group);
	}
}
