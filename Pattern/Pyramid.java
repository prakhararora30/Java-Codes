import java.util.Scanner;
public class Pyramid {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 5; i++) {
            for (int k = 0; k <= 5-i; k++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
