package iuh.fit.se.disambiguation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "iuh.fit.se.disambiguation")
public class AppConfig {

	@Bean
	@Primary
	public MyDateTimeFormatter myDateFormatter() {
		return new MyDateTimeFormatter();
	}
	
	
	@Bean (name = "myNumberFormatter") // đặt tên cho bean
	public MyNumberFormatter myNumberFormatter() {
		return new MyNumberFormatter();
	}
}
