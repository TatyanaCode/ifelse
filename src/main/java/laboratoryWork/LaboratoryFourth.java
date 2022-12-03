package laboratoryWork;

import java.util.Scanner;

/**
 * @author tatyana.danilova 03.12.2022 18:54
 * В двухзначное число вписать ноль в середину и получитьтрехзначное число
 */
public class LaboratoryFourth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Ввудите двухзначное число");
        int num = scanner.nextInt();
        String strNum = String.valueOf(num);
        int num1 = Integer.parseInt(strNum.substring(0, 1));
        int num2 = Integer.parseInt(strNum.substring(1, 2));
        System.out.println(num1+ "0" +num2);
    }
}
