abstract class Vehicle {

    private String make;
    private String model;
    private String colour;
    private int price;

    private int damage;

    public Vehicle(String make, String model, String colour, int price, int damage) {
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.price = price;
        this.damage = damage;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
