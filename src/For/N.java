package For;

import java.util.Scanner;

public class N {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Введите число N");
        int n = scanner.nextInt();

        for (int i = 0; i < n; ){
            i++;
            if (i == 10) continue;
            if (i > 50) break;
            System.out.println(i);
        }

    }
}
