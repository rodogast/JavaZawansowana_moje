package company;

public class SuperSecretary extends Secretary{

    public SuperSecretary(String name, int salary) {
        super(name, salary);
    }
    @Override
    public void makeCall(String number){
        System.out.println("zadzwonilam na numer"+ number);
        System.out.println("i robie kaw");

    }

}
