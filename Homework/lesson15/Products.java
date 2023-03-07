package lesson15;

public enum Products {
    METAL(5), CONSTRUCTION(10);

    private int weight;

    Products(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}
