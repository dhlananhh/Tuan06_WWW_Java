package iuh.fit.se.withoutdi;

public class Car {
	private ICEngine engine;
	
	public Car() {
		engine = new ICEngine(2.0f, "Petrol");
        engine.start();
	}

	public ICEngine getEngine() {
		return engine;
	}

	public void setEngine(ICEngine engine) {
		this.engine = engine;
	}
	
	
}
