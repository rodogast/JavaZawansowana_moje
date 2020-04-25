package animals;

public class Cat extends Animal implements Runner{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void saySomthing() {
        System.out.println("mia mia");
    }

    @Override
    public void run() {
        System.out.println("kops kops");
    }
}
