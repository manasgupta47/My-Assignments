import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Assignment4Q6 {
    public static void main(String[] args) {
        List<String> ll=new ArrayList<>();
        ll.add("ram");
        ll.add("shyam");
        ll.add("Radhe");
        Assignment4Q6 a4q6=new Assignment4Q6();
        System.out.println(a4q6.convertToUpperCase(ll));
    }

    public List<String> convertToUpperCase(List<String> list) {
        UnaryOperator<String> toupperCase=str->str.toUpperCase();
        list.replaceAll(toupperCase);
        return list;
    }
}
