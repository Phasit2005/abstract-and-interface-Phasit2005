public class ContractEmployee extends Employee{
    int hoursWorked;
    double hourlyRate;

    ContractEmployee(String name, int hoursWorked, double hourlyRate){
        super(name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary(){
        return hoursWorked * hourlyRate;
    }
}
