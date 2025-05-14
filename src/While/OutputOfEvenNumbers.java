package While;

import java.util.Scanner;

public class OutputOfEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите число");
        int xranenie = scanner.nextInt();

        if (xranenie < 0) {
            System.out.println("Не может быть отрицательным");
            
        }
        while (xranenie >= 0) {
            System.out.println(xranenie);
            xranenie--;
        }

    }
}
