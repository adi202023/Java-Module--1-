import java.util.Scanner;

public class SquareArr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[5];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;

        int i = 0; // initialize index
        while(i < a.length) { // condition
            int sqofarr = a[i] * a[i]; // square of the current element
            System.out.println("Square of " + a[i] + " is: " + sqofarr);
            i++; // increment index
        }
    }
}

