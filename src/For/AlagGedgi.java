package For;

public class AlagGedgi {
    public static void main(String[] args) {
         for (int i = 0; i < 10; ) {
             i++;
             if (i == 3) continue;
             if (i == 7) break;
             System.out.println(i);
         }
    }
}
