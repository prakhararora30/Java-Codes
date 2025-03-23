import java.util.Scanner;
public class Grades {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks of five subjects: ");
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        int sum = a + b + c + d + e;

        int percentage = sum / 5;

        switch(percentage/10){

            case 10:
                System.out.println("A+");
                break;
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 6:
                System.out.println("C");
                break;
            default:
                System.out.println("D");
        }

    }
}