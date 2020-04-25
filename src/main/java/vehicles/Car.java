package vehicles;

import org.w3c.dom.ls.LSOutput;

public class Car {
    private String brand;
    private String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void show(){
        System.out.println("wyswietl "+brand + model);
    }


}
