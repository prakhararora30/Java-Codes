import java.util.Scanner;
public class InvertedHollowPyramid {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j<=2*(5-i) - 2; j++) {
                if(j == 0 || j == (2 * (5 - i) - 2) ){
                    System.out.print("* ");
                }

                else if(i == 0){
                    System.out.print("* ");
                }

                else{
                    System.out.print("  ");
                }
            }

            System.out.print("\n");
        }
    }
}