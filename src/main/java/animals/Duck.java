package animals;

public class Duck extends Bird {
    public Duck(String name) {
        super(name);
    }

    @Override
    public void saySomthing() {
        System.out.println("KWa Kwa");

    }


}
