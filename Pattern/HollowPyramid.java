import java.util.Scanner;
public class HollowPyramid {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5-i; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j < 2 * i + 1; j++) {
                if(j == 0 || j == 2*i){
                    System.out.print("* ");
                }

                else if(i == 4){
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