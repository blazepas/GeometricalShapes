package pl.blazej.szczypka.geometrical.shapes;

public class Blackboard {
    public static void main(String[] args) {
    Triangle triangle = new Triangle("Triangle", 5.0, 3.0, 3.0, 11.0);
        System.out.println(triangle);
    Square square = new Square("Square", 2);
        System.out.println(square);
        System.out.println("Square perimiter = "+ square.countingPerimiter(2.0));
    triangle.setLengthSideA(6.71);
    triangle.setLengthSideB(12.09);
    triangle.setLengthSideC(13.50);
        System.out.println("New triangle: " + triangle + "\n" + "New perimiter is: " + (triangle.countingPerimiter()));
        System.out.println(triangle.getLengthSideA()); //?? Dlaczego musze dawać tą metode do sout aby ją wyświetlić??
    }


    }

