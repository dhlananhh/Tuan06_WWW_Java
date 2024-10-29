package iuh.fit.se.withdi;

public class MyAppWithDI {

	public static void main(String[] args) {
		// Tạo ICEngine
		Engine iceEngine = new ICEngine(2.0f, "Petrol");
		
		// Tạo Car sử dụng ICEngine
		Car car1 = new Car(iceEngine);
		
		// Tạo HybridEngine
        Engine hybridEngine = new HybridEngine();
        
        // Tạo Car sử dụng HybridEngine
        Car car2 = new Car(hybridEngine);

        car1.start();
        car2.start();
	}

}
