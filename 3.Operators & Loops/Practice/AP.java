import java.util.Scanner;

public class AP{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        int x=sc.nextInt();
        int count=1, n=1;
        while(count<=x){
            int num=3*n+2;
            if(num%4!=0){
                System.out.print(num+" ");
                count++;
            }
            n++;
        }
    }
}