package fruits;

public class Apple extends Fruit {
    public Apple(int weight) {
        super(weight);
    }

    @Override
    public int getWeight() {
        return weight ;
    }
}
