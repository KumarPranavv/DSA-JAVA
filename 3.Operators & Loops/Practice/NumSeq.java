
import java.util.Scanner;

public class NumSeq {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Integers: ");
        int n = sc.nextInt();
        System.out.println("Enter the prev Number: ");
        int prev = sc.nextInt();

        int count = 2, current;
        boolean isDec = true;
        while (count <= n) {
            current = sc.nextInt();

            if (current == prev) {
                System.out.println("false");
                return;
            }
            if (current < prev) {
                if (isDec == false) {
                    System.out.println("false");
                }
                return;
            } else {
                if (isDec == true) {
                    System.out.println("false");
                }
            }
            prev = current;
            count++;

        }
        System.out.println("true");

    }
}
