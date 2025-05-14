package If;

import java.util.Scanner;

public class EigheteenPlus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст");
        int age = scanner.nextInt();

        if (age < 0 || age > 100) {
            System.out.println("Неверный возраст");
        } else if (age >= 18 && age <= 80) {
            System.out.println("Права можно получить");
        } else {
            System.out.println("Права получить нельзя");
        }
    }
}
