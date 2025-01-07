
import java.util.Scanner;

public class SumProduct {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int n = sc.nextInt();
        System.out.println("Enter the choice (1 for sum or 2 for Product): ");
        int c = sc.nextInt();

        if (c == 1) {
            int sum = 0, num = 1;
            while (num <= n) {
                sum += num;
                num++;
            }
            System.out.println("The Req. Sum is: " + sum);
        } else if (c == 2) {
            int product = 1, num = 1;
            while (num <= n) {
                product *= num;
                num++;
            }
            System.out.println("The req. Product is: " + product);

        } else {
            System.out.println(-1);
        }
    }
}
