package pl.blazej.szczypka.geometrical.shapes;

// ogólnie jest dobrze, drobna kosmetyka (formatowanie kodu)
public class Square extends Shapes {
    // wszelkie 'osierocone/magiczne' wartości liczbowe dodajemy jako stałe z odpowiednią nazwą
    public static final int NUMBER_OF_SIDES = 4;

    // tu zmieniłem nazwę zmiennej na 'sideLength'
    private double sideLength;

    public Square(String type, double sideLength) {
        this.type = type;
        this.sideLength = sideLength;
    }

    // czy na pewno do policzenia 'obwodu' musisz znów przesyłać 'sideLength'?
    // masz już to zapisane w klasie, a co jak ktoś przesłał by inną wartość niż ta zapisania oryginalnie?
    // np.: w konstruktorze podałeś sideLength = 5, a do metody ktoś przesłał sideLength = 77 ...
    public double countingPerimeter(double sideLength) {
        return NUMBER_OF_SIDES * sideLength;
    }
    // ... wystarczy metoda bez parametru
    public double countingPerimeter() {
        return NUMBER_OF_SIDES * this.sideLength;
    }

    @Override
    public String toString() {
        return "Square{" +
                "type='" + type + '\'' +
                ",sideLength=" + sideLength +
                // ", perimiter=" + perimiter +
                '}';
    }

}
