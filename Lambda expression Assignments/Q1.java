import java.util.Scanner;

public class Assignment4Q1 {
    interface ArthmeticOperation {
        double operate(int a, int b);
    }
    public double addition(int num1,int num2){
        ArthmeticOperation add=(a,b)->a+b;
        return add.operate(num1,num2);
    }
    public double subtraction(int num1,int num2){
        ArthmeticOperation sub=(a,b)->a-b;
        return sub.operate(num1,num2);
    }
    public double multiplication(int num1,int num2){
        ArthmeticOperation multi=(a,b)->a*b;
        return multi.operate(num1,num2);
    }
    public double division(int num1,int num2){
        ArthmeticOperation div=(a,b)->(double) a/ (double) b;
        return div.operate(num1,num2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter thr first number");
        int num1=sc.nextInt();
        System.out.println("Enter thr second number");
        int num2=sc.nextInt();
        Assignment4Q1 a4q1=new Assignment4Q1();
        System.out.println("Addition of numbers "+a4q1.addition(num1,num2));
        System.out.println("Subtraction of numbers "+a4q1.subtraction(num1,num2));
        System.out.println("Multiplication of numbers "+a4q1.multiplication(num1,num2));
        System.out.println("Division of numbers "+a4q1.division(num1,num2));
    }
}
