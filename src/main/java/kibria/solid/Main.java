package kibria.solid;

import java.util.List;

public class Main {
    public static void main(String[]args){
        AreaCalculator ac = new AreaCalculator();
        Circle circle = new Circle(10);
        Square square = new Square(10);
        Cube cube = new Cube(12);
        NoShape noShape = new NoShape();
        ShapesPrinter shapesPrinter = new ShapesPrinter();

        List<Shape> shapes = List.of(circle, square, cube, noShape);
        int sum = ac.sum(shapes);
        System.out.println(shapesPrinter.json(sum));
        System.out.println(shapesPrinter.csv(sum));
    }
}
