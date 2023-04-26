
import java.util.Scanner;

class ArmstrongOrNot {
public boolean armstrongCheck(int num){
    boolean ans=false;
    int sum=0;
    int temp=num;
    while(num!=0){
        int n=num%10;
        sum += n*n*n;
        num=num/10;
    }
    if(sum==temp){
        ans=true;
    }
    return ans;
}
}
public class Assignment1Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        ArmstrongOrNot ATN=new ArmstrongOrNot();
        if(ATN.armstrongCheck(num)) {
            System.out.println(num+" is armstrong number");
        }
        else{
            System.out.println(num+" is not armstrong number");
        }
    }
}
