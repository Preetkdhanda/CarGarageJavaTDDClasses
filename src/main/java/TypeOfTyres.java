public enum TypeOfTyres {
    SLICKS("Slicks"), OFFROAD("Off Road"), SNOWTYRES("Snowtyres"),NORMAL("Normal");

    private final String value;

    TypeOfTyres(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
