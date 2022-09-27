public enum TypeOfCar {

    FUEL("Fuel"), HYBRID("Hybrid"),ELECTRIC("Electric");

    private final String value;

    TypeOfCar(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
