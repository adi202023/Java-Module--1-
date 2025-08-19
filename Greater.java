import java.util.Scanner;

public class Greater {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if(a>=b && a>=c){
            System.out.println(a +"is greatest number:");
        }
        else if(b>=a && b>=c){
            System.out.println(b +"is greatest number");
        }
        else {
            System.out.println(c +"is greatest number");
        }
    }
}
