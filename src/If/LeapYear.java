package If;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год");
        int year = scanner.nextInt();

        if (year < 0 || year >9999){
            System.out.println("Неврный формат года");
        } else if (year % 4 == 0 || year % 400 == 0){
            System.out.println(year + "  Год високостный" + "\n" +
            "Количество днй в феврале 29" + "\n" +
            "Количество дней в году 366");
        } else {
            System.out.println(year + "  Год не високосный" + "\n" +
                    "Количество дней в феврале 28" + "\n" +
                    "Количество дней в году 365");
        }
    }
}
