import java.util.Scanner;
public class InvertedPyramid {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
    for (int i = 0; i < 5; i++) {
            
            for (int k = 0; k < i; k++) {
                System.out.print("  ");
            }
            
            for (int j = 0; j < 2 * (5-i) - 1; j++) {
                System.out.print("* ");
            }
            
            System.out.print("\n");
        
        }
    }
}
