class SpecificMotorcycle extends Motorcycle {
    private double price;
    private boolean availability;

    public SpecificMotorcycle(String brand, String model, int maxSpeed, String type, double price, boolean availability) {
        super(brand, model, maxSpeed, type);
        this.price = price;
        this.availability = availability;
    }

    @Override
    public String getDetails() {
        return String.format("Brand: %s, Model: %s, Max Speed: %dkm/h, Type: %s, Price: %.2f, Available: %s",
                brand, model, maxSpeed, type, price, availability ? "Yes" : "No");
    }
}
