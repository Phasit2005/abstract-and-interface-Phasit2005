public abstract class Employee {
    String name;
    double salary;

    public Employee(String name){
        this.name = name;
    }

    abstract double calculateSalary();

    public void showSalary(){
        System.out.println("ชื่อ : " + name + " เงินเดือน " + calculateSalary() + " บาท");
    }
}
