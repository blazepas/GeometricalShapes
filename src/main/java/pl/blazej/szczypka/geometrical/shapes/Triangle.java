package pl.blazej.szczypka.geometrical.shapes;

// ogólnie jest dobrze, drobna kosmetyka (formatowanie kodu)
public class Triangle extends Shapes {
    private double lengthSideA;
    private double lengthSideB;
    private double lengthSideC;

    // nie ma potrzeby podawania domyślnego konstruktora, jeżeli z niego nie korzystasz
    // np.: tworzysz new Triangle(), ale to zależy od logiki aplikacji czy dajesz możliwość tworzenia 'pustych' Triangle
//    public Triangle() {}

    // nie wiem czy w konstruktorze powinien być parametr 'perimeter' jego się wylicza,
    // mógłbyś wywołać w konstruktorze metodę countingPerimeter(), ale UWAGA:
    // 1. https://stackoverflow.com/questions/18348797/why-is-it-considered-bad-practice-to-call-a-method-from-within-a-constructor
    // 2. https://stackoverflow.com/questions/18138397/calling-method-from-constructor
    public Triangle(String type, double lengthSideA, double lengthSideB, double lengthSideC, double perimiter) {
        this.type = type;
        this.perimiter = perimiter;
        this.lengthSideA = lengthSideA;
        this.lengthSideB = lengthSideB;
        this.lengthSideC = lengthSideC;
    }

    public double countingPerimiter() {
        return lengthSideA + lengthSideB + lengthSideC;
    }

    public String getType() {
        return type;
    }

    public double getLengthSideA() {
        return lengthSideA;
    }

    public double getLengthSideB() {
        return lengthSideB;
    }

    public double getLengthSideC() {
        return lengthSideC;
    }

    public void setLengthSideA(double lengthSideA) {
        this.lengthSideA = lengthSideA;
    }

    public void setLengthSideB(double lengthSideB) {
        this.lengthSideB = lengthSideB;
    }

    public void setLengthSideC(double lengthSideC) {
        this.lengthSideC = lengthSideC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "type='" + type + '\'' +
                "' lengthSideA=" + lengthSideA +
                ", lengthSideB=" + lengthSideB +
                ", lengthSideC=" + lengthSideC +
                ", perimiter=" + perimiter +
                '}';
    }
}
