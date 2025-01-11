import java.util.Scanner;

public class Largest{
    public static int largestEle(int input[]){
        int max=Integer.MIN_VALUE;
        int size=input.length;
        for(int i=0;i<size;i++){
            if(input[i]>max){
                max=input[i];
            }
        }
        return max;

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
        int largest=largestEle(arr);
        System.out.println("Largest element: "+largest);
    }
}