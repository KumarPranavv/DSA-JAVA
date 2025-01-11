import java.util.Scanner;
import java.util.Arrays;
public class ArrayUse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int input[] = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            input[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.println("The elements are: " + input[i]);
        }
        System.out.println("The array is: " + Arrays.toString(input)); //array to string
    }
}
