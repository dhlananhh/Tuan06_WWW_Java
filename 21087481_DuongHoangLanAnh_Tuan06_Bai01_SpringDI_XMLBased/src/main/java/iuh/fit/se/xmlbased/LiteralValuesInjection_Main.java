package iuh.fit.se.xmlbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import iuh.fit.se.xmlbased.entities.Class_;

public class LiteralValuesInjection_Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("LiteralValuesInjection.xml");
        Class_ class_ = context.getBean("class2", Class_.class);
        System.out.println(class_);
	}

}
