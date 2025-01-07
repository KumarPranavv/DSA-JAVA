
import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        int temp = n, rev_n = 0;
        while (temp > 0) {
            int LD = temp % 10;
            temp = temp / 10;
            rev_n = rev_n * 10 + LD;
        }
        System.out.println("The reveresed number is: " + rev_n);
    }
}
