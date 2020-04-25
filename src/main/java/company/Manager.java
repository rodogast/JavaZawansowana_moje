package company;

public class Manager extends Employee{
    private int bonus;
    private Secretary secretary;


    public Manager(String name, int salary) {// konstruktor 2 skladnikowy
        super(name, salary);
        this.bonus= 0;
    }

    public Manager(String name, int salary, int bonus) {//konstruktor 3 skladnikowy
        super(name, salary);
        this.bonus = bonus;
    }

    @Override//przyslonniecie
    public int getSalary() {
        return salary+ bonus;
    }

    public void makeCall(String number){
        if(this.secretary==null) {
            System.out.println("nie umimie dzwonic");
        }else{
            this.secretary.makeCall(number);
        }
    }

    public void makeSpeech(){
        System.out.println("zapierdzeilac!!!!");

    }

    public void makeSpeech(String additionalMessege){
        this.makeSpeech();
    }


    public void setSecretary(Secretary secretary) {
        this.secretary=secretary;
    }
}




