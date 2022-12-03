package laboratoryWork;
import java.util.Scanner;

/**
 * @author tatyana.danilova 03.12.2022 14:03
 * Лабораторная работа №2 Развлетвляющиеся алгоритмы
 *
 */
public class LaboratoryOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите значение x");
        int x = scanner.nextInt();
        if (x >= 3) {
            System.out.println(-x * x + 3 * x + 9);
        }
        if (x < 3) {
            System.out.println(1 / (x * x * x - 6));
        }

    }

}
