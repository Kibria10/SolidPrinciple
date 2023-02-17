package kibria.solid;

public class ShapesPrinter {
    public String json(int sum){
        return String.format("{sum: %s}", sum);
    }

    public String csv(int sum){
        return String.format("{sum, %s}", sum);
    }
}
