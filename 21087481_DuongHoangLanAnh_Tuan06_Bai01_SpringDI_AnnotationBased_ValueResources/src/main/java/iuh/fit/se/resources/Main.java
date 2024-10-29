package iuh.fit.se.resources;


import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

	public static void main(String[] args) throws IOException {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ClientBean clientBean = context.getBean(ClientBean.class);
        clientBean.doSomething();
	}

}
