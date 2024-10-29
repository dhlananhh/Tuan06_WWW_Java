package iuh.fit.se.annotationbased.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyNumberFormatterService {
	@Autowired
	private MyNumberFormatter myNumberFormatter;
	
	public void printFormat (double number) {
		System.out.println(myNumberFormatter.format(number));
	}
}
