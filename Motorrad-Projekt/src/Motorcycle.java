abstract class Motorcycle {
    protected String brand;
    protected String model;
    protected int maxSpeed;
    protected String type; // e.g., Sport, Touring, Offroad

    public Motorcycle(String brand, String model, int maxSpeed, String type) {
        this.brand = brand;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    public abstract String getDetails();
}
