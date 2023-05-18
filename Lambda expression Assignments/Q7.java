import java.util.HashMap;
import java.util.Map;

public class Assignment4Q7 {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("Rajesh",55);
        map.put("Ramesh",57);
        map.put("Asmit",58);
        Assignment4Q7 a4q7=new Assignment4Q7();
        System.out.println(a4q7.convertKeyValueToString(map));
    }
    public String convertKeyValueToString(Map<String, Integer> map) {
        StringBuilder sb=new StringBuilder();
        map.entrySet().forEach(entry->{
            sb.append(entry.getKey()+" "+entry.getValue()+" ");
        });
        return sb.toString();
    }
}

