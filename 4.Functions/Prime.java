import java.util.Scanner;
public class Prime{
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int d=2;
        while(d<n){
            if(n%d==0){
                return false;
            }
            d++;

        }
        return true;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        System.out.println(isPrime(n));
        
    }
}