import java.util.ArrayList;
class Employee{
    int salary=10000;
    public int getSalary(int salary){
        return salary;
    }
}
class Manager extends Employee{
    public int getSalary(int salary){
        int incentive=5000;
        return salary+incentive;
    }
}
class Labour extends Employee{
    public int getSalary(int salary){
        int overtime=500;
        return salary+overtime;
    }
}
public class Assignment2Q2 {
    int totalSalary=0;
public int totalEmployeeSalary(ArrayList<Employee> employees){
    for(Employee emp:employees){
        totalSalary+=emp.getSalary(emp.salary);
    }
    return totalSalary;
}
    public static void main(String[] args) {
ArrayList<Employee> employees=new ArrayList<>();
employees.add(new Manager());
employees.add(new Labour());
employees.add(new Manager());
Assignment2Q2 a2q2=new Assignment2Q2();
int totalSalary= a2q2.totalEmployeeSalary(employees);
        System.out.println("Total salary of all employees "+totalSalary);

    }
}
