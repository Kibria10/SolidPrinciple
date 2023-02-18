package kibria.solid;

public class NoShape implements Shape{
    @Override
    public double area() {
        throw new IllegalStateException("Can not calculate the area");
    }
}
