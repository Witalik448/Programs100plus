package If;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите оператор +,-,*,/");
        char operator = scanner.next().charAt(0);
        System.out.println("Введите второе число");
        int b = scanner.nextInt();

        if (operator == '+') {
            System.out.println("Результат: " + (a + b));
        } else if (operator == '-') {
            System.out.println("Результат: " + (a - b));
        } else if (operator == '*') {
            System.out.println("Результат: " + (a * b));
        } else if (operator == '/') {
            if (b != 0) {
                System.out.println("Результат: " + (a / b));
            } else {
                System.out.println("На 0 делить нельзя");
            }
        } else {
            System.out.println("Неверный оператор");
        }
    }
}
