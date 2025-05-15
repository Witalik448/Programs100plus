package While;

import java.util.Scanner;

public class Perevorot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числло");
        int num = scanner.nextInt();

        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num/10;
        }
        System.out.println(reversed);
    }
}
