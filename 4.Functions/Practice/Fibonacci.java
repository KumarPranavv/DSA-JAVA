import java.util.Scanner;

public class Fibonacci{
    
    public static boolean CheckNumber(int n){
        int a=0;
        int b=1;
        while(a<n){
            int c=a+b;
            a=b;
            b=c;
        }
        if(a==n){
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        System.out.println(CheckNumber(n));
    }
    
}