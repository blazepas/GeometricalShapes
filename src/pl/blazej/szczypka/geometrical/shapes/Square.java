package pl.blazej.szczypka.geometrical.shapes;

public class Square extends Shapes {
    private double lengthSide;

    public Square (String type, double lengthSide){
        this.type = type;
        this.lengthSide = lengthSide;

    }

    public double countingPerimiter(double lengthSidee){
        return 4*lengthSidee;
    }



    @Override
    public String toString() {
        return "Square{" +
                "type='" + type + '\'' +
                ",lengthSide=" + lengthSide +
               // ", perimiter=" + perimiter +
                '}';
    }
}
