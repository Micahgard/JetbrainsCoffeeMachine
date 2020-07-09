import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt();
        int[] array = new int[len];
        int product;

        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        product = array [len - 2] * array [len - 1];
        System.out.println(product);
    }

}