package iuh.fit.se.annotationbased.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan (basePackages = "iuh.fit.se.annotationbased.javaconfig")
public class AppConfig {
	
	@Bean
	@Primary // Đánh dấu MyDateTimeFormatter là primary bean
	public MyDateTimeFormatter myDateTimeFormatter() {
		return new MyDateTimeFormatter();
	}

	
	@Bean
	public MyNumberFormatter myNumberFormatter() {
		return new MyNumberFormatter();
	}
}
