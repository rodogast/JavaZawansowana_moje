package fruits;

public abstract class Fruit implements WeightProvider {

    protected int weight;

    public Fruit(int weight) {
        this.weight = weight;
    }
}
//jako ze to klasa abstrakcyjna ktora dzieisczymy kazdy owoc bedzie musial miec ten konstruktor i podac wagr