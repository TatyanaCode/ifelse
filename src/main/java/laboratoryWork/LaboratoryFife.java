package laboratoryWork;

import java.util.Scanner;

/**
 * @author tatyana.danilova 03.12.2022 21:06
 * Даноцелое число  26>n>1 Вывести прописные заглавныебуквы латинского алфавита
 */
public class LaboratoryFife {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 1 || n > 26) {
            System.out.println("Введено некорректное число. Необходимо ввести число от 1 до 26");
        }
        char a = 'A';
        for (int i = 0; i < n; i++) {
            System.out.print((char) (a + i));
        }
    }
}
