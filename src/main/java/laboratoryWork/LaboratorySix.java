package laboratoryWork;

import java.util.Arrays;

/**
 * @author tatyana.danilova 03.12.2022 21:32
 * Дан массив символов. Заменить в нем каждую точку многоточием
 */
public class LaboratorySix {
    public static void main(String[] args) {
        String str = (" Заменить точку на три точки .");
        System.out.println(str.replace(".", "..."));
        char[] chars = str.toCharArray();
        for (char ch : str.toCharArray()) {
            if (ch == '.') {
                System.out.println(str.replace(".", "..."));
            }
        }

    }
}
