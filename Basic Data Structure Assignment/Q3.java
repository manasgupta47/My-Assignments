import java.util.Scanner;

class SiCi {
    public double simpleInterest(double principalAmount,int time,double interestRate){
        double ans=(principalAmount*interestRate*time)/100;
        return ans;
    }
    public double compoundInterest(double principalAmount,int time,double interestRate){
        double ans=principalAmount*(Math.pow((1+interestRate/100),time))-principalAmount;
        return ans;
    }
}
public class Assignment1Q3 {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Principal amount");
        double principalAmount=sc.nextDouble();
        System.out.println("Enter Annual interest rate");
        double interestRate=sc.nextDouble();
        System.out.println("Enter Term of loan, in years");
        int time=sc.nextInt();
        SiCi a1q3=new SiCi();
        System.out.println("Simple Interest :- "+a1q3.simpleInterest(principalAmount,time,interestRate));
        System.out.println("Compound Interest :- "+a1q3.compoundInterest(principalAmount,time,interestRate));
    }
}

