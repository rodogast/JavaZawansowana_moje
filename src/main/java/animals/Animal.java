package animals;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {

    }

    public abstract void saySomthing();
}
