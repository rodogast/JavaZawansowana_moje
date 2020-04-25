package company;

public class  Secretary extends Employee{

    public Secretary(String name, int salary) {
        super(name, salary);
    }

    public void makeCall(String number){
        System.out.println("zadzwonilam na numer"+ number);

    }

}
