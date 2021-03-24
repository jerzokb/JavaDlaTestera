package enums;

public enum Gender {
    M("Mężczyzna"),
    K("Kobieta");

    private String name;

    Gender(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
