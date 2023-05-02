import java.util.ArrayList;

class CurrentAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int creditLimit = 2000;

    public int getCash() {
        return totalDeposits+creditLimit;
    }
}
class SavingsAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int fixedDepositAmount = 5000;

    public int getCash() {
        return totalDeposits+fixedDepositAmount;
    }
}
public class Assignment2Q3 {
    public int totalCashInBank(ArrayList<Integer> cash){
        int totalCash=0;
        for(int rs:cash){
            totalCash+=rs;
        }
        return totalCash;
    }
    public int getCash(){
        return 0;
    }
    public static void main(String[] args) {
        ArrayList<Integer> cashInBank=new ArrayList<>();
        CurrentAccount currentAccount1=new CurrentAccount();
        cashInBank.add(currentAccount1.getCash());
        CurrentAccount currentAccount2=new CurrentAccount();
        cashInBank.add(currentAccount2.getCash());
        SavingsAccount savingsAccount1=new SavingsAccount();
        cashInBank.add(savingsAccount1.getCash());
        Assignment2Q3 a2q3=new Assignment2Q3();
        System.out.println("Total cash in bank "+a2q3.totalCashInBank(cashInBank));
    }
}
