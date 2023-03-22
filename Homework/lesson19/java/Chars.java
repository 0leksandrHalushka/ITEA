package lesson19.java;

public class Chars {
    private String name;
    private String value;

    public Chars() {
    }

    public Chars(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Chars{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
