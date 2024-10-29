package iuh.fit.se.withdi;

public class ICEngine implements Engine {
	private float cylinderCapacity;
    private String type;

    public ICEngine(float cylinderCapacity, String type) {
        this.cylinderCapacity = cylinderCapacity;
        this.type = type;
    }

    public float getCylinderCapacity() {
        return cylinderCapacity;
    }

    public void setCylinderCapacity(float cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

	@Override
	public void start() {
		System.out.println("ICEngine is started...");
	}

    
}
