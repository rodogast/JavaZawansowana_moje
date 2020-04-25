package animals;

public class Dog extends Animal implements Runner {
    public Dog(String name) {
        super(name);

    }

    @Override
    public void saySomthing() {
        System.out.println("haou hau");
    }

    @Override
    public void run() {
        System.out.println("hops hops");
    }
}
