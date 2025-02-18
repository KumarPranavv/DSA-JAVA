public class Power{
    public static int pow(int x, int n){
        if(x==0 && n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        int smallAns=pow(x,n/2);
        if(n%2==0){
            return smallAns*smallAns;
        }
        else{
            return x*smallAns*smallAns;
        }
    }
    public static void main(String[] args){
        int x=2;
        int n=8;
        int ans=pow(x,n);
        System.out.println(ans);
    }
}