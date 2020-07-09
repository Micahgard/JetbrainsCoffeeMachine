import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt();
        int[] array = new int[len];
        int count = 0;

        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < len - 2; i++) {
            if (array[i] + 1 == array[i + 1] && array[i + 1] == array[i + 2] - 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}