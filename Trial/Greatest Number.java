import java.util.Scanner;
class mai{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b){
            System.out.println("Greatest Integer Is" +a);
        }
        else{
            System.out.println("Greatest Integer Is" +b);
        }
    }
}
