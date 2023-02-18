package kibria.solid;

public class Cube implements Shape{

    private final int length;

    public Cube(int length){
        this.length = length;
    }

    public int getLength(){
        return  length;
    }

    @Override
    public double area(){
        return 6*Math.pow(getLength(),2);
    }
}
