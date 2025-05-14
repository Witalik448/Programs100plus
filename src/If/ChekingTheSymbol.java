package If;

import java.util.Scanner;

public class ChekingTheSymbol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите букву");
        char symbol = scanner.next().charAt(0);

        if ((symbol >= 'A' && symbol <= 'Z') || (symbol >= 'a' && symbol <= 'z')) {
            System.out.println("Это английская буква буква");
        } else {
            System.out.println("Это русская буква");
        }
    }
}


