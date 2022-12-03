package laboratoryWork;

import java.util.Scanner;

/**
 * @author tatyana.danilova 03.12.2022 14:31
 * Даны две точки А (x1 , y1) и В( x2, y2). Составить алгоритм, определяющий , которая из точек находится
 * ближе к началу координат.
 */
public class LaboratoriTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты точки A");
        int  x1 = scanner.nextInt();
        int  y1 = scanner.nextInt();
        System.out.println("Введите координаты точки B");
        int  x2 = scanner.nextInt();
        int  y2 = scanner.nextInt();
        double length1 = Math.sqrt(x1*x1+y1*y1);
        double length2 = Math.sqrt(x2*x2+y2*y2);
        if (length1 == length2) {
            System.out.println("Точки равноудаленны от начала координат");
        } else if (length1 < length2) {
            System.out.println("Точка A ближе к началу координат");
        } else {
            System.out.println("Точка B ближе к началу координат");
        }
    }
}
