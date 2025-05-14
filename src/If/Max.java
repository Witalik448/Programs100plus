package If;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a < b ) {
            System.out.println("Второе число больше " + a + "<" + b);
        } else if (a > b) {
            System.out.println("Первое число больше " + a + ">" + b);
        } else {
            System.out.println("Числа равны " + a  + " = " + b);
        }
    }
}
