import java.util.Scanner;

public class NcR_Function{
    public static int factorial(int n){
        int num=1;
        for(int i=1;i<=n;i++){
            num*=i;
        }
        return num;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n and r: ");
        int n=sc.nextInt();
        int r=sc.nextInt();

        int num=factorial(n);
        int dec1=factorial(r);
        int dec2=factorial(n-r);

        int ans=num/(dec1*dec2);
        System.out.println("The value of nCr is: "+ans);


    
        
    }
}