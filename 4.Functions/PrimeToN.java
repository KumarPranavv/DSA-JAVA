
public class PrimeToN{
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
    public static void printPrimes(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args){
        printPrimes(1000);
    }
}