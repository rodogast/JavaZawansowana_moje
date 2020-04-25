import vehicles.Car;

public class VehivlesMain {
    public static void main(String[] args) {
        Car[] cars = new Car[5];

        cars[0]= new Car("bmw","e46");
        cars[1]= new Car("fiat","e33");
        cars[2]= new Car("ferrari","123");
        cars[3]= new Car("mercedes","321");
        cars[4]= new Car("dacia","2352");

        cars[3].setModel("ttt");

        for (Car mYcar : cars) {
            mYcar.show();
        }


    }

}
