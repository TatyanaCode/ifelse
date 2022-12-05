package laboratoryWork;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author tatyana.danilova 03.12.2022 21:38
 *
 */
public class LaboratorySeven {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность m");
        int m = scanner.nextInt();
        System.out.println("Введите размерность n");
        int n = scanner.nextInt();
        int[][] arr = new int[m][n];
        Random rnd = new Random();
        // заполнение массива
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = rnd.nextInt();
            }
        }
        long sum = 0;
        for (int i = 0; i < m; i++) {
            if (i % 2 != 0) {
                for (int j = 0; j < n; j++) {
                    sum += arr[i][j];
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

//        System.out.println(Arrays.deepToString(arr));
        System.out.println(sum);
    }

}
