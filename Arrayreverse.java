public class Arrayreverse {
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] arr = {1, 2, 3, 4, 5};

        System.out.print("Array in reverse: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
