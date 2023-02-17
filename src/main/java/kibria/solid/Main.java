package kibria.solid;

import java.util.List;

public class Main {
    public static void main(String[]args){
        AreaCalculator ac = new AreaCalculator();
        Circle circle = new Circle(10);
        Square square = new Square(10);
        ShapesPrinter shapesPrinter = new ShapesPrinter();

        List<Object> shapes = List.of(circle, square);
        int sum = ac.sum(shapes);
        System.out.println(shapesPrinter.json(sum));
        System.out.println(shapesPrinter.csv(sum));

    }
}
