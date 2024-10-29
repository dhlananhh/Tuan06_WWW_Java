package iuh.fit.se.disambiguation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Disambiguation_Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MyFormatService service = context.getBean(MyFormatService.class);
        service.printFormat();
	}

}
