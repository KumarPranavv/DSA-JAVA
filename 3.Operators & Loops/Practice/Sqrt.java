
import java.util.Scanner;

public class Sqrt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int ans = 0;
        while (ans * ans <= n) {
            ans++;
        }
        System.out.println("The Integral Square root of N is: " + (ans - 1));

    }
}
