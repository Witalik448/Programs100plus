package For;

import java.util.Scanner;

public class TablicaYmnozheniya {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цифру от 1 до 10");
        int n = scanner.nextInt();
        for (int i = 0; i <= 10; ){
            if (n < 0 || n > 10) {
                System.out.println("от 1 до 10");
                break;
            }
            i++;
            if (i == 10) break;
            int sum = n * i;

            System.out.println(n + "*" + i + " = " + sum);
        }

    }
}
