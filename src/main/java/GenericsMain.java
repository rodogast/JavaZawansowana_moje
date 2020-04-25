import fruits.Apple;
import fruits.Box;
import fruits.Fruit;
import fruits.Wattererlon;

public class GenericsMain {


    public static void main(String[] args) {
        Box<Fruit> fruitBox = new Box<>(new Apple(10));
        Box<Fruit> fruitBox2 = new Box<>(new Wattererlon(55));

        Box<Box> superBox= new Box<>(fruitBox2);
        System.out.println(superBox.getWeight());
    }
}
