class Rectangle5 extends Shape5 {
    @Override
    public String draw() {
        return "Drawing a Rectangle";
    }
}

class Line5 extends Shape5{
    @Override
    public String draw() {
       return "Drawing a Line";
    }
}

class Cube5 extends Shape5 {
    @Override
    public String draw() {
        return "Drawing a Cube";
    }
}
abstract class Shape5 {
    abstract public String draw();
}
public class Assignment2Q5{
    public static void main(String[] args) {
        Shape5 Line=new Line5();
        System.out.println(Line.draw());
        Shape5 Rectangle=new Rectangle5();
        System.out.println(Rectangle.draw());
        Shape5 Cube=new Cube5();
        System.out.println(Cube.draw());
    }
}

