import java.util.ArrayList;
public class Assignment4Q4 {
    public ArrayList<String> removeOddLength(ArrayList<String> employeeList){
         employeeList.removeIf(n->n.length()%2==1);
         return employeeList;
    }
    public static void main(String[] args) {
        ArrayList<String> employeeList= new ArrayList<>();
        employeeList.add("Ram");
        employeeList.add("Kisan");
        employeeList.add("Charu");
        employeeList.add("Om");
        employeeList.add("RadheSHyam");
        Assignment4Q4 a4q4=new Assignment4Q4();
        System.out.println(a4q4.removeOddLength(employeeList));
    }
}
