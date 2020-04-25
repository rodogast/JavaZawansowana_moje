package enums;

public enum Color {
    BLUE{
        @Override
        public void sing() {
            System.out.println("blue is is sing");
        }
    }, RED{
        @Override
        public void sing() {
            System.out.println("red is sing");
        }
    }, GREEN{
        @Override
        public void sing() {
            System.out.println("green is sing");
        }
    };

    public abstract void sing();// zmuszam do kompilacji w kazdej metodzie inaczej nie uda nam sie to skompilowac!!!
                                //abstrakcyjna musi bysc skompilowana wszedzie bo inaczej musisz stworzyc cialo!!! tej metody


}
