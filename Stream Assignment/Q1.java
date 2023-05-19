import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Fruit {
    private String name;
    private int calories;
    private int price;
    private String color;

    public Fruit(String name, int calories, int price, String color) {
        this.name = name;
        this.calories = calories;
        this.price = price;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public  String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

public class Assignment5Q1 {

    public static List<String> reverseSort(ArrayList<Fruit> fruits) {
        List<String> al=new ArrayList<>();
        al=fruits.stream().filter(f-> f.getCalories() <100).sorted(Comparator.comparingInt(Fruit::getCalories).reversed()).map(Fruit::getName).collect(Collectors.toList());
        return al;
    }
    public static ArrayList<Fruit> sort(ArrayList<Fruit> Fruits) {
        ArrayList<Fruit> sortedFruits=new ArrayList<>();
        sortedFruits = (ArrayList<Fruit>) Fruits.stream().sorted(Comparator.comparing(Fruit::getColor)).collect(Collectors.toList());
        return sortedFruits;
    }
    public static ArrayList<Fruit> filterRedSortPrice(ArrayList<Fruit> fruits){
        ArrayList<Fruit> sortedfruits=new ArrayList<>();
        sortedfruits =(ArrayList<Fruit>) fruits.stream().filter(f->f.getColor().equalsIgnoreCase("red")).sorted(Comparator.comparingInt(Fruit::getPrice)).collect(Collectors.toList());
        return sortedfruits;
    }

    public static void main(String[] args) {
ArrayList<Fruit> fruits=new ArrayList<>();
fruits.add(new Fruit("Apple",85,100,"red"));
fruits.add(new Fruit("Mango",110,105,"yellow"));
fruits.add(new Fruit("Grapes",90,80,"Green"));
fruits.add(new Fruit("Lichi",80,107,"Red"));
Assignment5Q1 a5q1=new Assignment5Q1();
List<String> revSortFruit=reverseSort(fruits);
        System.out.println("Low Calories Fruit Names :-");
        for (String y:revSortFruit) {
            System.out.println(y);
        }
ArrayList<Fruit> colorwiseFruit=sort(fruits);
        System.out.println("Colour Wise Fruit");
        colorwiseFruit.forEach(f-> System.out.println("Name "+f.getName()+" Color "+f.getColor()+" Price "+f.getPrice()+" Calories "+f.getCalories()));
        ArrayList<Fruit> RedSortFruit=filterRedSortPrice(fruits);
        System.out.println("Price Wise Fruit");
RedSortFruit.forEach(f-> System.out.println("Name "+f.getName()+" Color "+f.getColor()+" Price "+f.getPrice()+" Calories "+f.getCalories()));

    }

}

