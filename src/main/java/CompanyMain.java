import company.Employee;
import company.Manager;
import company.Secretary;
import company.SuperSecretary;

public class CompanyMain {
    public static void main(String[] args) {
        Employee jan= new Employee("jan",200);
        Manager kamil = new Manager("kamil",250,40);

        System.out.println("jan zarabia"+jan.getSalary());
        System.out.println("kamil zarabia"+kamil.getSalary());

        kamil.makeSpeech();

        System.out.println("----");

        Employee[] employees = new Employee[3];
        employees[0] = new Employee("jan",200);
        employees[1] = new Secretary("wojtek",400);
        employees[2] = new Manager("krzysiu",500);

        for(Employee employee:employees){
            employee.show();
        }

        System.out.println("--------");

Secretary secretary= (Secretary) employees[1];
SuperSecretary superSecretary= new SuperSecretary("graza",200);

kamil.makeCall("888888");
kamil.setSecretary(secretary);
kamil.makeCall("55555");
kamil.setSecretary(superSecretary);







    }


}
