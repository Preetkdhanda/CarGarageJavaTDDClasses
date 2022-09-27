public enum TypeOfEngine {
    ENGINE1_2(1.2), ENGINE1_4(1.4), ENGINE1_6(1.6), ENGINE1_8(1.8);

    private final double value;

    TypeOfEngine(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
