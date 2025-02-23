public class Pow{
    public static int pow(int x, int n){
        if(n==0){
            return 1;

        }

        int ans=pow(x,n-1);
        return ans*x;
    }
    public static void main(String[] args){
        int x=7, n=3;
        System.out.println("The ans is: "+pow(x,n));
    }
}