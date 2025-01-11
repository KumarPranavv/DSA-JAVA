import java.util.Scanner;
import java.util.Arrays;
public class ArrayUse {
    public static int[] takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int input[] = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            input[i] = sc.nextInt();
        }
        return input;
    }
    public static void print(int input[]){
        int size=input.length;
        System.out.println("The elements are: ");
        for (int i = 0; i < size; i++) {
            System.out.print(input[i]+" ");
            
        }
        System.out.println();
        System.out.println("the elements are: "+ Arrays.toString(input));
    }


    public static void main(String[] args) {
        int arr[]=takeInput();
        print(arr);
        
        
    }
}
