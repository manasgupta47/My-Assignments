import java.util.ArrayList;
import java.util.stream.Collectors;

public class Assignment4Q2 {

    private int totalPrice;
    private String status;
public Assignment4Q2(int totalPrice,String status){
    this.status=status;
    this.totalPrice=totalPrice;
}
    public static ArrayList<Assignment4Q2> listOfOrders(ArrayList<Assignment4Q2> orders) {
        ArrayList<Assignment4Q2> al= (ArrayList<Assignment4Q2>) orders.stream()
                .filter(a ->a.totalPrice>10000 && (a.status.equals("ACCEPTED") || a.status.equals("COMPLETED"))).collect(Collectors.toList());
        return al;
}
    public static void main(String[] args) {
    ArrayList<Assignment4Q2> orders=new ArrayList<>();
    orders.add(new Assignment4Q2(5000,"ACCEPTED"));
        orders.add(new Assignment4Q2(20000,"PROCESSING"));
        orders.add(new Assignment4Q2(15000,"COMPLETED"));
        orders.add(new Assignment4Q2(8000,"ACCEPTED"));
        orders.add(new Assignment4Q2(12000,"COMPLETED"));
ArrayList<Assignment4Q2> ans=Assignment4Q2.listOfOrders(orders);
        System.out.println("List of Orders");
        for (Assignment4Q2 al:ans){
            System.out.println("Total Price "+al.totalPrice+" Status "+al.status);
        }
}

}
