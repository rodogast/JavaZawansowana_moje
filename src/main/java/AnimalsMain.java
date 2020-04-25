import animals.*;

import java.util.logging.SocketHandler;

public class AnimalsMain {
    public static void main(String[] args) {
        Dog dog = new Dog("ares");
        Cat cat = new Cat("filemon");

        Runner runner = dog; //implementacja doga implemtujacego runera;

        dog.saySomthing();
        runner.count();
        cat.run();
        cat.saySomthing();


        Runner otherRunner = new Runner() { ///classa annonimowa to pozwala na stworzenie classy slassy anonimowej
            @Override
            public void run() {
                System.out.println("Biegne!");
            }
                };
        otherRunner.run();
    }
}
