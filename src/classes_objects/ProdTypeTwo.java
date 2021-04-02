package classes_objects;

public enum ProdTypeTwo {
    ONE("one", 1), TWO("two", 2), THREE("three", 3);

    private String name;
    private int digit;

    private ProdTypeTwo(String name, int digit) {
        this.name = name;
        this.digit = digit;
    }

    public int getDigit() {
        return digit;
    }

    public String getName() {
        return name;
    }
}
