package While;

import java.util.Scanner;

public class summ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите N");
        int n = scanner.nextInt();

        int sum = 0;
        int iter = 0;
        while (iter < n) {
            iter++;
            sum += iter;
        }
        System.out.println("Сумма цифр всех чисел N  " + n + " = " + sum);
    }
}
