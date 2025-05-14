package If;

import java.util.Scanner;

public class Plus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        float chislo = scanner.nextFloat();

        if (chislo < 0 && chislo % 2 == 0 ) {
            System.out.println(chislo + " Число отрицательное и четное");
        } else if (chislo > 0 && chislo % 2 == 0) {
            System.out.println(chislo + " Число положитльное и четное ");
        } else if (chislo < 0 && chislo % 2 != 0) {
            System.out.println(chislo + " Число отрицательное и нечетное");
        } else if (chislo > 0 && chislo % 2 != 0) {
            System.out.println(chislo + " Число положительное и нечетное");
        } else {
            System.out.println(chislo + " Не отрицательный и не положительный а такжее не может быть четным и нечетным");
        }
    }
}
