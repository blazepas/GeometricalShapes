package pl.blazej.szczypka.geometrical.shapes;

// zmieniłem strukturę katalogów na standardową
// https://maven.apache.org/guides/introduction/introduction-to-the-standard-directory-layout.html
public class Blackboard {

    // ogólnie brak uwag, jest dobrze, drobna kosmetyka (formatowanie kodu, podział kodu)
    public static void main(String[] args) {
        // dodałem wizualny podział kodu dla grup operacji, np.:
        // 1. towrzysz 'triangle' i go wyświetlasz ...
        Triangle triangle = new Triangle("Triangle", 5.0, 3.0, 3.0, 11.0);
        System.out.println(triangle);

        // ...
        // 2. nadajesz wartości 'triangle' i je wyświetlasz
        triangle.setLengthSideA(6.71);
        triangle.setLengthSideB(12.09);
        triangle.setLengthSideC(13.50);
        System.out.println("New triangle: " + triangle + "\n" + "New perimiter is: " + (triangle.countingPerimiter()));
        System.out.println(triangle.getLengthSideA()); //?? Dlaczego musze dawać tą metode do sout aby ją wyświetlić??
        // odpowiedź na powyższe pytanie, metoda zwraca wartość nie wyświetla jej, to od Ciebie zależy co z nią zrobisz
        // czy przekażesz gdzieś indziej czy dasz do 'sout' możesz umieścić 'sout' w ciele metody getLengthSideA()

        // 3. działasz na 'square' oddzielny 'wizualny blok'
        Square square = new Square("Square", 2);
        System.out.println(square);
        System.out.println("Square perimiter = " + square.countingPerimeter(2.0));
    }

    // możesz sobie povczytać:
    // - http://www.oracle.com/technetwork/java/codeconventions-135099.html
    // - http://www.oracle.com/technetwork/java/javase/documentation/codeconvtoc-136057.html
    // - http://www.iwombat.com/standards/JavaStyleGuide.html
}
