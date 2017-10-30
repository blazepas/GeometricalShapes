package pl.blazej.szczypka.geometrical.shapes;

public class Triangle extends Shapes {
    private double lengthSideA;
    private double lengthSideB;
    private double lengthSideC;

    public Triangle(){}

    public Triangle(String type, double lengthSideA, double lengthSideB, double lengthSideC, double perimiter) {
        this.type = type;
        this.perimiter = perimiter;
        this.lengthSideA = lengthSideA;
        this.lengthSideB = lengthSideB;
        this.lengthSideC = lengthSideC;
    }

    public double countingPerimiter(){
        return lengthSideA+lengthSideB+lengthSideC;
    }

    public String getType(){return type;}
    public double getLengthSideA(){return lengthSideA;}
    public double getLengthSideB(){return lengthSideB;}
    public double getLengthSideC(){return lengthSideC;}
    public void setLengthSideA(double lengthSideA) {this.lengthSideA = lengthSideA;}
    public void setLengthSideB(double lengthSideB) {this.lengthSideB = lengthSideB;}
    public void setLengthSideC(double lengthSideC) {this.lengthSideC = lengthSideC;}

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
