package For;

import java.util.Scanner;

public class TablicaYmnozheniya {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цифру от 1 до 10");
        int n = scanner.nextInt();

        for (int i = 0; i <= 10; ){
            i++;
            if (i == 10) break;
            int sum = n * i;
            System.out.println(n + "*" + i + " = " + sum);
        }

    }
}
