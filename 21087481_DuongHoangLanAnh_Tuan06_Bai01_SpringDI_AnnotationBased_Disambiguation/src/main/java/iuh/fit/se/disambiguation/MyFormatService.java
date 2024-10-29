package iuh.fit.se.disambiguation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MyFormatService {

	@Autowired
	@Qualifier ("myNumberFormatter") // sử dụng qualifier để disambiguate 
	private MyFormatter formatter;
	
	public MyFormatService (MyFormatter formatter) {
		this.formatter = formatter;
    }
	
	public void printFormat() {
		System.out.println(formatter.format());
	}
	
}
