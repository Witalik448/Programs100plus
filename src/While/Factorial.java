package While;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число N");
        int n = scanner.nextInt();

        int factarial = 1;
        int i = 1;

        while (i <= n){
            factarial *= i;
            i++;
        }
        System.out.println("Фактариал:" + n + " = " + factarial);


        }
    }

