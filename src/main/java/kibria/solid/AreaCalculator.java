package kibria.solid;

import java.util.List;

public class AreaCalculator {
    public int sum(List<Object> shapes){
        int sum = 0;
        for (int i = 0; i < shapes.size(); i++){
            Object shape = shapes.get(i);

            if (shape instanceof Square){
                sum += Math.pow(((Square)shape).getLength(),2);
            }

            if (shape instanceof Circle){
                sum+= Math.PI * Math.pow(((Circle)shape).getRadius(),2);
            }
        }
        return sum;
    }

    //Now suppose we want to print the values of the sum in json and csv format. So we are creating two more methods in AreaCalculator class
    public String json(List<Object> shapes){
        return String.format("{sum: %s}", sum(shapes));
    }

    public String csv(List<Object> shapes){
        return String.format("{sum, %s}", sum(shapes));
    }
}
