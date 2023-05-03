import java.util.Scanner;

class Login{
    String userId = "Ajay",password = "password";
    public String loginUser(String user, String pass) {
        if(userId.equals(user) && password.equals(pass)){
            return "true";
        }
        else{
            return "false";
        }
    }

}
public class Assignment1Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=0;
        while(n<3){
            System.out.println("Enter userId");
            String user= sc.nextLine();
            System.out.println("Enter password");
            String pass=sc.nextLine();
            Login a1q6=new Login();
            if(a1q6.loginUser(user,pass)=="true") {
                System.out.println("Welcome " + user);
                break;
            }
            else{
                n++;
                if(n!=3)
                System.out.println("You have entered wrong credentials ,please enter the right credentials.");
            }

        }
        if(n==3){
            System.out.println("You have entered wrong credentials 3 times");
            System.out.println("Contact Admin");
            System.exit(0);
        }
    }
}
