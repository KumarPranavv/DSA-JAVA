import java.util.Scanner;

public class LinearSearch{
    public static int search(int input[], int X){
        
        for(int i=0;i<input.length;i++){
            if(input[i]==X){
                return i;
            }
        }
        return -1;


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
        Scanner sc = new Scanner(System.in);
        int arr[]=takeInput();
        System.out.println("Enter the element to be found: ");
        int X=sc.nextInt();
        
        int ans=search(arr,X);
        System.out.println("The element is found at index: "+ans);
    }
}
