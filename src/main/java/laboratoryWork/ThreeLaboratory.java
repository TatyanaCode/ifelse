package laboratoryWork;

import java.util.Scanner;

/**
 * @author tatyana.danilova 03.12.2022 18:14
 * Дано трехзначноечисло. Найти произведение едениц и  сотен данного числа.
 */
public class ThreeLaboratory {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int num = scanner.nextInt();
        if (num < 100 || num > 999) {
            System.out.println("Введено некорректное число. ДОпустимы только 3-хзначные числа");
            return;
        }
        String strNum = String.valueOf(num);
        int num1 = Integer.parseInt(strNum.substring(0, 1));
        int num2 = Integer.parseInt(strNum.substring(2, 3));

        System.out.println(num1 * num2);

    }
}
