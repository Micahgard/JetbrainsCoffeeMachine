import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt();
        double[] company = new double[len];
        double[] tax = new double[len];
        double[] paidTax = new double[len];

        for (int i = 0; i < len; i++) {
            company[i] = scanner.nextInt();
        }

        for (int i = 0; i < len; i++) {
            tax[i] = scanner.nextInt();
        }

        for (int i = 0; i < len; i++) {
            if (company[i] == 0.0) {
                paidTax[i] = 0.0;
                continue;
            }
            if (tax[i] == 0.0) {
                paidTax[i] = 0.0;
                continue;
            }
            paidTax[i] = company[i] * tax[i];
        }

        double highestTax = 0;
        int k = 1;
        for (int i = 0; i < company.length; i++) {
            if (paidTax[i] > highestTax) {
                highestTax = paidTax[i];
                k = i + 1;
            }
        }
        //System.out.println(Arrays.toString(paidTax));
        System.out.println(k);
    }
}