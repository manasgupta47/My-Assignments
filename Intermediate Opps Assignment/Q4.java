abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract void makeSound();
}
class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println("Woof!");
    }
}
public class Assignment2Q4 {
    public static void main(String[] args) {
Animal dog=new Dog("max",3);
        System.out.println("Name: "+dog.getName());
        System.out.println("Age: "+dog.getAge());
        dog.makeSound();
        abstract class shape{}
        class Circle extends shape{}
    }
}
