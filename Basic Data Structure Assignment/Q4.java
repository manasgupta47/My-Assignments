import java.util.Scanner;

class ResultDeclaration{
    public String declareResults( double subject1Marks, double subject2Marks, double subject3Marks) {
        String ans="";
        if(subject1Marks>60 && subject2Marks > 60 && subject3Marks >60){
            ans+="Passed";
        } else if(subject1Marks>60 && subject2Marks > 60 || subject1Marks>60 && subject3Marks>60 || subject2Marks > 60 && subject3Marks >60){
            ans+="Promoted";
        }
        else{
          ans+="failed";
        }
        return ans;
    }
}
public class Assignment1Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("First subject marks");
        double subject1Marks=sc.nextDouble();
        System.out.println("Second subject marks");
        double subject2Marks=sc.nextDouble();
        System.out.println("Third subject marks");
        double subject3Marks=sc.nextDouble();
        ResultDeclaration a1q4=new ResultDeclaration();
        System.out.println(a1q4.declareResults(subject1Marks,subject2Marks,subject3Marks));

    }
}
