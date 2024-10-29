package iuh.fit.se.annotationbased.javaconfig;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class MyNumberFormatter implements MyFormatter {
	@Autowired
	private MyFormatter formatter;
	
	public String format (double number) {
		return "Number format: " + formatter.format() + " - " + number;
	}

	@Override
	public String format() {
		return "MyNumberFormatter";
	}
}
