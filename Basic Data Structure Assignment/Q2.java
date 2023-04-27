import java.util.ArrayList;

class ArmstrongBetweenRange{
    public int[] armstrongNumbersInRange(int min, int max){
        ArrayList<Integer> al=new ArrayList<>();
        for(int i = min;i<=max;i++){
            int sum=0;
            int x=i;
            int n=0;
            while(x!=0){
                x=x/10;
                n++;
            }
            x=i;
            while(x!=0){
                int d=x%10;
                sum +=Math.pow(d,n);
                x/=10;
            }
            if(sum==i){
                al.add(sum);
            }
        }
       int[] ans=al.stream().mapToInt(x->x).toArray();
        return ans;
    }
}
public class Assignment1Q2 {
    public static void main(String[] args) {
        ArmstrongBetweenRange ABR=new ArmstrongBetweenRange();
        int[] arr= ABR.armstrongNumbersInRange(100,999);
        System.out.println("Armstrong number are : ");
        for (int a:arr) {
            System.out.print(a+" ");
        }
    }
}
