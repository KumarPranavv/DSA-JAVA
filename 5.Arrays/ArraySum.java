import java.util.Scanner;

public class ArraySum{
    public static int Sum(int input[]){
        int sum=0;
        for(int i=0;i<input.length;i++){
            sum+=input[i];
        }
        return sum;


    }
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
    public static void main(String[] args){
        int arr[]=takeInput();
        int ans=Sum(arr);
        System.out.println("The sum of the elements: "+ans);
    }
}
