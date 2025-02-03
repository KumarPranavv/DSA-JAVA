import java.util.Scanner;


public class LargestColSum{
    public static int[][] takeInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows: ");
        int rows=sc.nextInt();
        System.out.println("Enter the no. of columns: ");
        int cols=sc.nextInt();
        int[][] input=new int[rows][cols]; 
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println("Enter the element at "+i+" row "+j+" column ");
                input[i][j]=sc.nextInt();
            }
        }
        return input;

    }
    public static void print(int[][] input){
        int rows=input.length;
        int cols=input[0].length;
        System.out.println("The Array is : ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(input[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int col(int[][] input){
        int largest=Integer.MIN_VALUE;
        int rows=input.length;
        int cols=input[0].length;
        for(int j=0;j<cols;j++){
            int sum=0;
            for(int i=0;i<rows;i++){
                sum+=input[i][j];
            }
            if(sum>largest){
                largest=sum;
            }
        }
        return largest;

    }
    public static void main(String args[]){
        int[][] input=takeInput();
        System.out.println(col(input));
        
    }
}