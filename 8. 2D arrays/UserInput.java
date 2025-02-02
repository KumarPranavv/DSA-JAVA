import java.util.Scanner;

public class UserInput{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows: ");
        int rows=sc.nextInt();
        System.out.println("Enter the no. of colms: ");
        int colms=sc.nextInt();
        int input[][]=new int[rows][colms];
        for(int i=0;i<rows;i++){
            for(int j=0;j<colms;j++){
                System.out.println("Enter the element at "+i+" row "+j+" column ");
                input[i][j]=sc.nextInt();
            }
        }
        System.out.println("The array is: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<colms;j++){
                System.out.print(input[i][j]+" ");
            }
            System.out.println();
        }

    }
}
