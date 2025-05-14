package While;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пароль");
        int password = scanner.nextInt();

        int outPassword = 12345;

       while (password == outPassword){
           System.out.println("Доступ разрешен");
           break;
       } while (password != outPassword){
            System.out.println("Доступ заперешен");
            break;
        }
    }
}
