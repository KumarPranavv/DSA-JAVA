public class MoreFunctions{
    public static double sum(int a,int b, double c){
        double ans=a+b+c;
        return ans;
    }
    public static void main(String[] args){
        int num1=10;
        int num2=90;
        double result=sum(num1,num2,1.2);
        System.out.println("the sum is: "+result);
    }
}