public enum TypeOfGearbox {

    MANUAL("Manual"), AUTOMATIC("Automatic");

    private final String value;

    TypeOfGearbox(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
