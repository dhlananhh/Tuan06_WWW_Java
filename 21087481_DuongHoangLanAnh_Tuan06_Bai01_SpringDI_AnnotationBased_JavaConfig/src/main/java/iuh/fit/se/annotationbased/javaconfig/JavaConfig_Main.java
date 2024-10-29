package iuh.fit.se.annotationbased.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfig_Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MyNumberFormatterService service = context.getBean(MyNumberFormatterService.class);
        service.printFormat(1800d);
	}

}
