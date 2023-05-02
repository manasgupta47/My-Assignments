import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Assignment4Q5 {


    public static void main(String[] args) {
        List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");
        Assignment4Q5 a4q5=new Assignment4Q5();
        System.out.println(a4q5.processWords(list));
    }

    public static String processWords(List<String> list) {
        StringBuilder str=new StringBuilder();
        Consumer<String> displ=a -> str.append(a.charAt(0));
        list.forEach(displ);
        return str.toString();
        }

    }

