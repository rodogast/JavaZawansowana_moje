package enums;

public enum Size {
    SMALL, MEDIUM(10), LARGE(20);

    int maxWeight;

    Size() {
        System.out.println("wywoluje konstruktor bezargumentowy ");
    }

    Size(int maxWeight) {
        this.maxWeight = maxWeight;
        System.out.println("wywoluje konstruktor 1 argumentowy " + maxWeight);

    }

    public int getMaxWeight() {
        return maxWeight + 2;
    }


}
