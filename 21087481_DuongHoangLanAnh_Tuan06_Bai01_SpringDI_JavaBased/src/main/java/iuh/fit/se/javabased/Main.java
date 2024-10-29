package iuh.fit.se.javabased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(UserService.class);
		
		User user = context.getBean(User.class);
		System.out.println(user);
		
		Group group = context.getBean(Group.class);
		System.out.println(group);
	}

}
