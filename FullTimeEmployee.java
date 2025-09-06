public class FullTimeEmployee extends Employee{
    FullTimeEmployee(String name, double salary){
        super(name);
        this.salary = salary;
    }

    @Override
    public double calculateSalary(){
        return salary;
    }
}
