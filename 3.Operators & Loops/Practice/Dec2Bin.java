
import java.util.Scanner;

public class Dec2Bin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Num: ");
        int n = sc.nextInt();
        int decimal = 0, pow = 1;
        while (n > 0) {
            int last = n % 10;
            decimal += last * pow;
            pow *= 2;
            n = n / 10;
        }
        System.out.println("The decimal num: " + decimal);
    }
}
