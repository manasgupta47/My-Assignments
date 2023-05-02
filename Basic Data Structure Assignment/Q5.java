import java.util.Scanner;

class TaxAmount{
    public double calculateTaxAmount(int ctc){
        double ans=0;
        if(ctc>=0 && ctc<=180000){
            ans=0;
        }
        else if(ctc >=181001 && ctc<=300000){
            ans=(ctc*10)/100;
        } else if(ctc >=300001 && ctc<=500000) {
            ans = (ctc * 20) / 100;
        } else if (ctc >=500001 && ctc<=1000000) {
            ans = (ctc * 30) / 100;
        }
        return ans;
    }
}
public class Assignment1Q5 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Income Range");
        int ctc=sc.nextInt();
        TaxAmount a1q5=new TaxAmount();
        System.out.println("Taxable amount "+a1q5.calculateTaxAmount(ctc));
    }
}
