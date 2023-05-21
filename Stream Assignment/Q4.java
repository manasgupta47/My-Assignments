import java.util.*;
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

class Transaction {
    private Trader trader;
    private int year;
    private int value;

    public Transaction(Trader trader, int year, int value) {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }

    public Trader getTrader() {
        return trader;
    }

    public void setTrader(Trader trader) {
        this.trader = trader;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "trader=" + trader +
                ", year=" + year +
                ", value=" + value +
                "}\n";
    }
}
public class Assignment5Q4 {
    public static List<Transaction> sortTransactions(List <Transaction> transactions) {
        List<Transaction> transaction=transactions.stream().filter(t->t.getYear()==2011).sorted(Comparator.comparing(v->v.getValue())).collect(Collectors.toList());
        return transaction;
    }
    public static List<Integer> transactionsValuesDelhi(List<Transaction> transactions) {
        List<Integer> values=transactions.stream().filter(t->t.getTrader().getCity().equalsIgnoreCase("Delhi")).map(v->v.getValue()).collect(Collectors.toList());
        return values;
    }
    public static int highestTransaction(List<Transaction> transactions){
        return transactions.stream().max(Comparator.comparing(Transaction::getValue)).map(v->v.getValue()).orElseThrow(NoSuchElementException::new);
    }
    public static int smallestTransaction(List<Transaction> transactions){
        return transactions.stream().min(Comparator.comparing(Transaction::getValue)).map(v->v.getValue()).orElseThrow(NoSuchElementException::new);
    }


    public static void main(String[] args) {
        Trader trader1=new Trader("Manas","Banda");
        Trader trader2=new Trader("Pranjal","Kanpur");
        Trader trader3=new Trader("Kishan","Delhi");
        Trader trader4=new Trader("Om","Delhi");
        Trader trader5=new Trader("Monu","Indore");
        List<Transaction> transactions=new ArrayList<Transaction>();
        transactions.add(new Transaction(trader1,2011,1000));
        transactions.add(new Transaction(trader2,2010,1400));
        transactions.add(new Transaction(trader3,2011,1600));
        transactions.add(new Transaction(trader4,2023,1300));
        transactions.add(new Transaction(trader5,2011,1800));
        System.out.println("all transactions in the year 2011 and sort them by value (small to high) :-");
        System.out.println(sortTransactions(transactions).toString());
        System.out.println("all transactions’ values from the traders living in Delhi :-");
        System.out.println(transactionsValuesDelhi(transactions));
        System.out.println(" the highest value of all the transactions :-");
        System.out.println(highestTransaction(transactions));
        System.out.println(" the smallest value of all the transactions :-");
        System.out.println(smallestTransaction(transactions));

    }
}


