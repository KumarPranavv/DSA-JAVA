import java.util.Scanner;

public class Increment{
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
        for(int i=0;i<size;i++){
            System.out.print(input[i]+" ");
        }
        System.out.println();

    }

    public static void increment(int i){
        i++;
    }
    public static void incrementArray(int input[]){
        for(int i=0;i<input.length-1;i++){
            input[i]++;

        }
    }

    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        incrementArray(arr);
        print(arr);
    }
}