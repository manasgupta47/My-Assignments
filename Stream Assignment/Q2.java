import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Trader {
    private String name;
    private String city;
    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Trader{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
public class Assignment5Q3 {
    public static List<String> printUniqueCities (List <Trader> traders) {
        List<String> al= traders.stream().filter(distinctByKey(Trader::getCity)).map(t->t.getName())
                .collect(Collectors.toList());
        return al;
    }
    public static List<String> tradersFromPuneSortByName(List<Trader> traders) {
        List<String> ans=traders.stream().filter(c->c.getCity().equalsIgnoreCase("Pune")).sorted(Comparator.comparing(Trader::getName)).map(n->n.getName()).collect(Collectors.toList());
        return ans;
    }
    public static String allTrader3Names(List<Trader> traders) {
        List<String> al=traders.stream().sorted(Comparator.comparing(Trader::getName)).map(n->n.getName()).collect(Collectors.toList());
        return String.join(", ",al);
    }
    public static ArrayList<Trader> areAnyTradersFromIndore(ArrayList<Trader> traders) {
        ArrayList<Trader> al= (ArrayList<Trader>) traders.stream().filter(n->n.getCity().equalsIgnoreCase("Indore")).collect(Collectors.toList());
    return al;
    }

  public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor){
        Set<Object> seen=ConcurrentHashMap.newKeySet();
        return t-> seen.add(keyExtractor.apply(t));
  }

    public static void main(String[] args) {
        List<Trader> list=new ArrayList<>();
        list.add(new Trader("Manas","Indore"));
        list.add(new Trader("Pranjal","indore"));
        list.add(new Trader("Kishan","Kanpur"));
        list.add(new Trader("Prateek","Lucknow"));
        list.add(new Trader("Bholu","Pune"));
        list.add(new Trader("Manoj","Pune"));
        System.out.println(printUniqueCities(list));
        System.out.println(tradersFromPuneSortByName(list));
        System.out.println(allTrader3Names(list));
        ArrayList<Trader> al=areAnyTradersFromIndore((ArrayList<Trader>) list);
        System.out.println(al.toString());

        }


}
